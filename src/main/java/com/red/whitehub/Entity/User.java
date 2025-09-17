

package com.red.whitehub.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name ="User")
public class User {
 
 @Id 
 @GeneratedValue( strategy = GenerationType.AUTO )
 private Long id;
    
 @Column( name = "name")
 private String name;
 
 @Column( name ="lastName")
 private String lastName;
 
 @Column( name = "userName")
 private String userName;
 
 @Column( name = "email")
 private String email;
 
 @Column( name = "password")
 private String password;
 
 @Column( name = "birthdate")
 private LocalDate birthdate;
 
 @Column( name = "birthdate")
 private LocalDateTime createdAt;
 
@Column( name = "updatedAt")
private LocalDateTime updatedAt;

@Column( name = "banned")
private boolean banned;

@Column( name = "bannedAt")
private LocalDateTime bannedAt;

@Column( name = "deleted")
private boolean deleted;

@Column( name = "deletedAt")
private LocalDateTime deletedAt;
 
 
//----------------------------------------------------------------------------- Getters ------------------------------------------------------------------------------------------// 
 
 
public Long getId(){
     return this.id;
 } 
 
 public String getName(){
     return this.name;
 }
 
  public String getLastName(){
     return this.lastName;
 }
  
  public String getUserName(){
     return this.userName;
 }
  
  public String getEmail(){
     return this.email;
 }
   
  public String getPassword(){
     return this.password;
 }
 
 public LocalDate getbirthdate(){
     return this.birthdate;
 }
 
 public LocalDateTime getCreatedAt(){
     return this.createdAt; 
 }

 public LocalDateTime getUpdatedAt(){
     return this.updatedAt; 
 }

 public Boolean getBanned(){
     return this.banned; 
 }

 public LocalDateTime getBannedAt(){
     return this.bannedAt;
 }

 public Boolean getDeleted(){
     return this.deleted;
 }

 public LocalDateTime getDeletedAt(){
     return this.deletedAt; 
 } 
 
 
 
//----------------------------------------------------------------------------- Setters------------------------------------------------------------------------------------------// 
  
 
  public void setName( String name ){
      this.name = name;
 }
 
  public void setLastName( String lastName){
     this.lastName = lastName;
 }
  
  public void setUserName( String userName ){
     this.userName = userName;
 }
  
  public void setEmail( String email){
      this.email = email;
 }
   
  public void setPassword( String password ){
      BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
      String encoded = encoder.encode(password);     
    this.password = encoded;
 }
 
 public void setbirthdate( LocalDate birthdate ){
      this.birthdate = birthdate;
 }
 
  public void setCreatedAt( LocalDateTime createdAt ){
     this.createdAt = createdAt; 
 }

 public void setUpdatedAt( LocalDateTime updatedAt ){
     this.updatedAt = updatedAt; 
 }

 public void setBanned( Boolean banned ){
     this.banned = banned; 
 }

 public void setBannedAt( LocalDateTime bannedAt ){
     this.bannedAt = bannedAt;
 }

 public void setDeleted( Boolean deleted ){ 
     this.deleted = deleted;
 }

 public void getDeletedAt( LocalDateTime deletedAt ){
     this.deletedAt = deletedAt; 
 } 
 

 
}
