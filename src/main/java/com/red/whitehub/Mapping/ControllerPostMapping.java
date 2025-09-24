

package com.red.whitehub.Mapping;

import com.red.whitehub.Dto.UserDTO;
import com.red.whitehub.JpaRepository.UserRepository;
import com.red.whitehub.Service.UserService;
import exception.EmailFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aleja
 */
@RestController
@RequestMapping("/api/users")
public class ControllerPostMapping {  
    
   private final UserService userService;
   
    public ControllerPostMapping(UserService userService) {
    this.userService = userService; // Spring pasa el bean automáticamente
}
    
    @PostMapping("/register")
    public ResponseEntity<String> getRegister(@RequestBody UserDTO userDto) { 
       
        try {
        userService.register(userDto); 
        return ResponseEntity.ok("Usuario registrado con éxito");
    } catch (EmailFoundException e) {  
        return ResponseEntity.badRequest().body(e.getMessage());
    }
    }
    
}
