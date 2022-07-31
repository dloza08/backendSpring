/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.backporfolio.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(max = 400)
    private String hd_urlbanner;
    private String hd_urlperfil;
    
    @Size(max = 150)
    private String hd_nombre;
    private String hd_apellido;
    @Size(max=200)
    private String hd_email;
    private String hd_ocupacion;
    @Size(max=500)
    private String hd_acerca;

    public Profile() {
    }

    public Profile(Long id, String hd_urlbanner, String hd_urlperfil, String hd_nombre, String hd_apellido, String hd_email, String hd_ocupacion, String hd_acerca) {
        this.id = id;
        this.hd_urlbanner = hd_urlbanner;
        this.hd_urlperfil = hd_urlperfil;
        this.hd_nombre = hd_nombre;
        this.hd_apellido = hd_apellido;
        this.hd_email = hd_email;
        this.hd_ocupacion = hd_ocupacion;
        this.hd_acerca = hd_acerca;
    }
    
    
        
}

 
 