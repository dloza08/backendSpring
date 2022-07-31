/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.backporfolio.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(max = 200)
    private String exp_puesto;
    
    @Size(max = 400)        
    private String exp_descripcion;
    private String exp_sitio;
    private String exp_urllogo;
    
    @Temporal(TemporalType.DATE)
    private Date exp_comienzo; 
    @Temporal(TemporalType.DATE)
    private Date exp_final; 
    
    public Experiencia() {
    }

    public Experiencia(Long id, String exp_puesto, String exp_descripcion, String exp_sitio, String exp_urllogo, Date exp_comienzo, Date exp_final) {
        this.id = id;
        this.exp_puesto = exp_puesto;
        this.exp_descripcion = exp_descripcion;
        this.exp_sitio = exp_sitio;
        this.exp_urllogo = exp_urllogo;
        this.exp_comienzo = exp_comienzo;
        this.exp_final = exp_final;
    }
    
    
}
