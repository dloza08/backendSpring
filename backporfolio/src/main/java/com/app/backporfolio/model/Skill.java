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
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(max = 300)
    private String sk_habilidad;
    @Size(max = 400)
    private String sk_urllogo;

    public Skill() {
    }

    public Skill(Long id, String sk_habilidad, String sk_urllogo) {
        this.id = id;
        this.sk_habilidad = sk_habilidad;
        this.sk_urllogo = sk_urllogo;
    }
       
    
    
}
