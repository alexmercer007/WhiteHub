

package com.red.whitehub.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name ="User")
public class User {
 
 @Id 
 @GeneratedValue( strategy = GenerationType.AUTO )
 private Long Id;
    
 @Column( name = "name")
 private String name;
 
 @Column( name ="lastName")
 private String lastName;
 
 @Column( name = "userName")
 private String userName;
 
 @Column( name = "password")
 private String password;
 
 
//----------------------------------------------------------------------------- Getters ------------------------------------------------------------------------------------------// 
 
 
public Long getId(){
     return this.Id;
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
   
  public String getPassword(){
     return this.password;
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
   
  public void getPassword( String password ){
      this.password = password;
 }
 
 
 

 
 
}
