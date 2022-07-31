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

public class Educacion {
    
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    private String ed_titulo;
    @Size(max = 300)
            
    private String ed_descripcion;
    private String ed_institucion;
    @Size(max = 300)
    private String ed_urllogo;
    @Temporal(TemporalType.DATE)
    private Date ed_comienzo; 
    @Temporal(TemporalType.DATE)
    private Date ed_final; 
    private Boolean ed_actual;
    private String ed_tipo;  

    public Educacion() {
    }

    public Educacion(Long id, String ed_titulo, String ed_descripcion, String ed_institucion, String ed_urllogo, Date ed_comienzo, Date ed_final, Boolean ed_actual, String ed_tipo) {
        this.id = id;
        this.ed_titulo = ed_titulo;
        this.ed_descripcion = ed_descripcion;
        this.ed_institucion = ed_institucion;
        this.ed_urllogo = ed_urllogo;
        this.ed_comienzo = ed_comienzo;
        this.ed_final = ed_final;
        this.ed_actual = ed_actual;
        this.ed_tipo = ed_tipo;
    }

    
}
