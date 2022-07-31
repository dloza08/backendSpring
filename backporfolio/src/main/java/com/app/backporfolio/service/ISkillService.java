/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.backporfolio.service;

import com.app.backporfolio.model.Skill;
import java.util.List;

/**
 *
 * @author dario
 */
public interface ISkillService {
    public List<Skill> verSkill();
    public void crearSkill (Skill ski);
    public void borrarSkill (Long id);
    public Skill buscarSkill (Long id);
    
}
