/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.backporfolio.service;

import com.app.backporfolio.model.Educacion;
import java.util.List;

/**
 *
 * @author dario
 */
public interface IEducacionService {
    public List<Educacion> verEducacion();
    public void crearEducacion (Educacion ed);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion (Long id);
    
}

