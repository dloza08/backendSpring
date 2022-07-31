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
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(max = 200)
    private String proy_nombre;
    @Size(max = 300)
    private String proy_descripcion;
    @Size(max = 400)
    private String proy_urlimg;
    @Temporal(TemporalType.DATE)
    private Date proy_fecha;

    public Project() {
    }

    public Project(Long id, String proy_nombre, String proy_descripcion, String proy_urlimg, Date proy_fecha) {
        this.id = id;
        this.proy_nombre = proy_nombre;
        this.proy_descripcion = proy_descripcion;
        this.proy_urlimg = proy_urlimg;
        this.proy_fecha = proy_fecha;
    }
 
    
}


  
