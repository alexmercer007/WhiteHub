/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.red.whitehub.Utilities;

/**
 *
 * @author aleja
 */
public class Rol {
    
    // Usuario
    
    public static final String ROLE_USER_GUEST = "ROLE_USER_GUEST";  // Usuario con cuenta, pero acceso restringido hasta completar verificación
    public static final String ROLE_VERIFIED = "ROLE_VERIFIED";  // eres un usuario real para otros usuarios y puedes tener beneficios como funciones ocultas 
    public static final String ROLE_USER = "ROLE_USER";  // Ver perfiles, no modificar
    public static final String ROLE_USER_EDITOR = "ROLE_USER_EDITOR";  // Crear, editar o borrar publicaciones propias
    public static final String ROLE_USER_MANAGER = "ROLE_USER_MANAGER";  // Ajustes de perfil: biografía, foto, privacidad
    
    // Maneger
    
    public static final String ROLE_ADMIN = "ROLE_ADMIN";  // Ver datos sensibles, sin control
    public static final String ROLE_MODERATOR = "ROLE_MODERATOR";
    public static final String ROLE_ADMIN_MANAGER = "ROLE_ADMIN_MANAGER";  // Control total
    
    
    public static final String ROLE_BANNED = "ROLE_BANNED";  // no publicar ni comentar solo ver feed temporalmente o  baneado para siempre no se
    
    // Full Manager despues de verificarse por segunda vez con una contraseña dada por la empresa, la primera es del manager ( doble capa XD )
    
    public static final String ROLE_SUPER_ADMIN = "ROLE_SUPER_ADMIN";  // Nivel máximo. Accede y gestiona a los administradores.
  
}
