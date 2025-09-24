

package com.red.whitehub.Service;

import com.red.whitehub.Dto.UserDTO;
import com.red.whitehub.Entity.User;
import com.red.whitehub.JpaRepository.UserRepository;
import java.util.Optional;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author aleja
 */
public class CustomUserDetailsService implements UserDetailsService {
    
    private final UserRepository userRepository;
    
    public CustomUserDetailsService(UserRepository userRepository) { 
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        User user = userRepository.findByUserName(username).orElseThrow(
                () -> new UsernameNotFoundException("Usuario no encontrado"));
        
        UserDTO userDto = new UserDTO(); 
        
        if (user.isBanned()) throw new DisabledException("Usuario bloqueado");
        if (user.getDeleted()) throw new DisabledException("Usuario eliminado");
        if (user.isTemporaryBan()) throw new LockedException("Usuario bloqueado temporalmente");
        
        userDto.setName(user.getName());
        userDto.setUserName(user.getUserName());
        userDto.setPassword(user.getPassword());
        userDto.setRole(user.getRole());   
      
        return new CustomUserDetails(userDto); 
    }
   
}
