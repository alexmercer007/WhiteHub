
package com.red.whitehub.Service;

import com.red.whitehub.Dto.UserDTO;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class CustomUserDetails implements UserDetails {
    
    UserDTO userDto = new UserDTO();
    
    public CustomUserDetails (UserDTO userDto){ 
        this.userDto = userDto;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Suponiendo que userDto.getRole() devuelve "USER" o "ADMIN"
    return List.of(new SimpleGrantedAuthority("ROLE_" + userDto.getRole()));
    }

    @Override
    public String getPassword() {
       return userDto.getPassword();
    }

    @Override
    public String getUsername() {
        return userDto.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired(); 
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked(); 
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired(); 
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled(); 
    }
    
}
