/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.backporfolio.service;

import com.app.backporfolio.model.Educacion;
import com.app.backporfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    public EducacionRepository eduRepo;
            
    @Override
    public List<Educacion> verEducacion() {
       return eduRepo.findAll();
    }
    
    @Override
    public void crearEducacion(Educacion ed) {
       eduRepo.save(ed);
    }

    @Override
    public void borrarEducacion(Long id) {
       eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
}
