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
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 

/**
 *
 * @author aleja
 */
public class UserDTO {
    

   
 private Long id;
 
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
 private LocalDate birthdate; 
 
 public UserDTO() {
    
}
 
    public UserDTO( Long id, String name, String lastName, String userName, String email, String password, LocalDate birthdate ){
 
    this.id = id; 
    this.name = name;
    this.lastName = lastName;
    this.userName = userName;
    this.email = email;
    this.password = password;
    this.birthdate = birthdate;
  
    }
    
    
//----------------------------------------------------------------------------------------- Setting ------------------------------------------------------------------------------------------//    
    
    
 public void setName( String name)  {
    this.name = name;
 }
 
  public void setLastName( String lastName)  {
    this.lastName = lastName;
 }
  
  public void setUserName( String userName)  {
    this.userName = userName;
 }
   
  public void setEmail( String Email)  {
    this.email = Email;
 }
  
  public void setPassword( String password)  {   
    this.password = password;
 }
 
  public void setBirthdate( LocalDate birthdate)  {
    this.birthdate = birthdate;
 }
  
 
 //----------------------------------------------------------------------------------------- Getting ------------------------------------------------------------------------------------------//
  

public Long getId( )  {
    return this.id;
 }  
  
 public String getName( )  {
    return this.name;
 }
 
  public String getLastName( )  {
    return this.lastName;
 }
  
  public String getUserName( )  {
    return this.userName;
 }
   
  public String getEmail( )  {
    return this.email;
 }
  
  public String getPassword( )  {
    return this.password;
 }
 
  public LocalDate getBirthdate( )  {
    return this.birthdate;
 }  
  
  
}
