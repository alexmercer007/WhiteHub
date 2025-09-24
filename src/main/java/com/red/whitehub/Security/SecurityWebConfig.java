

package com.red.whitehub.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityWebConfig {
    
  @Bean  
  public SecurityFilterChain filterChain(HttpSecurity http)  throws Exception {
  
    http.authorizeHttpRequests(authorize -> authorize
            .requestMatchers("/login","/feeds/**","/loginAdmin").permitAll()        
            .requestMatchers("/admin/**").hasRole("ADMIN")   
            .anyRequest().authenticated()
    )
    .formLogin(withDefaults())
    .logout(withDefaults());
      
      return http.build();

  }
    
    
    
    
    
}
