/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.red.whitehub.JpaRepository;

import com.red.whitehub.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aleja
 */
public interface JpaRepositoryUser extends JpaRepository<User, Long> {
    
}
