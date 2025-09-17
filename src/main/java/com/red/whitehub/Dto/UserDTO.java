/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.red.whitehub.Dto;

import com.red.whitehub.Entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;


/**
 *
 * @author aleja
 */
public class UserDTO {
    
 private User user;
   
 private Long Id;
 
 @NotBlank( message = "name not empty")
 @Size(max = 100)
 private String name;
 
 @NotBlank( message = "lastName not empty")
 @Size( max = 100 )
 private String lastName;
 
 @NotBlank( message = "userName not empty")
 @Size( max = 30 )
 private String userName;
 
 @NotBlank( message = "email not empty")
 @Email( message = "invalid email")
 @Size( max = 50 )
 private String email;
 
 @NotBlank( message = "password not empty")
 @Size( max = 256 )
 private String password;
 
 @NotNull( message = "compulsory age" )
 private LocalDateTime birthdate;
 
 public UserDTO() {
    this.user = new User(); // inicializa para que los setters funcionen
}
 
    public UserDTO( Long Id, String name, String lastName, String userName, String email, String password, LocalDateTime birthdate ){
 
    this.Id = Id;
    this.name = name;
    this.lastName = lastName;
    this.userName = userName;
    this.email = email;
    this.password = password;
    this.birthdate = birthdate;
  
    }
    
 public void setName( String name)  {
    this.user.setName(name);
 }
 
  public void setLastName( String lastName)  {
    this.user.setLastName(lastName);
 }
     
}
