

package com.red.whitehub.Entity;

import com.red.whitehub.Dto.UserDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
 
 @Column( name = "phoneNumber")
 private String phoneNumber;
 
 @ManyToOne
 @JoinColumn( name = "country_id") 
 private Country country;
 
 @Column( name = "createdAt")
 private LocalDateTime createdAt;
 
@Column( name = "updatedAt")
private LocalDateTime updatedAt;

@Column( name = "banned", nullable = false)
private boolean banned = false;

@Column( name = "bannedAt")
private LocalDateTime bannedAt;

@Column( name = "temporary_ban", nullable = false)
private boolean temporaryBan = false;

@Column( name = "temporary_ban_at")
private LocalDateTime temporaryBanAt;

@Column( name = "deleted")
private boolean deleted;

@Column( name = "deletedAt")
private LocalDateTime deletedAt;

@Column( name = "role")
private String role;

 
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
 
 public String getPhoneNumber(){
     return this.phoneNumber;
 }
 
 public Country getCountry(){
     return this.country;
 }
 
 public LocalDateTime getCreatedAt(){
     return this.createdAt; 
 }

 public LocalDateTime getUpdatedAt(){
     return this.updatedAt; 
 }

 public Boolean isBanned(){
     return this.banned; 
 }

 public LocalDateTime isBannedAt(){
     return this.bannedAt;
 }
 
 public Boolean isTemporaryBan(){
     return this.temporaryBan; 
 }

 public LocalDateTime isTemporaryBanAt(){
     return this.temporaryBanAt;
 }

 public Boolean getDeleted(){
     return this.deleted;
 }

 public LocalDateTime getDeletedAt(){
     return this.deletedAt; 
 } 
 
 public String getRole(){
     return this.role; 
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
 
  public void setPhoneNumber( String phoneNumber ){
     this.phoneNumber = phoneNumber;
 }
 
 public void setCountry( Country country){
      this.country = country;
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

 public void setDeletedAt( LocalDateTime deletedAt ){
     this.deletedAt = deletedAt; 
 } 
 
 public void setRole( String role){
     this.role = role; 
 } 

 
}
