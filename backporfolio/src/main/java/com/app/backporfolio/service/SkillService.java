/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.backporfolio.service;

import com.app.backporfolio.model.Skill;
import com.app.backporfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SkillService implements ISkillService{
    @Autowired 
    public SkillRepository skiRepo;
    
    @Override
    public List<Skill> verSkill() {
        return skiRepo.findAll();
    }

    @Override
    public void crearSkill(Skill ski) {
        skiRepo.save(ski);
    }

    @Override
    public void borrarSkill(Long id) {
        skiRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skiRepo.findById(id).orElse(null);
    }
    
}
