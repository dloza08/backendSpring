/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.backporfolio.service;

import com.app.backporfolio.model.Project;
import java.util.List;

/**
 *
 * @author dario
 */
public interface IProjectService {
    public List<Project> verProject();
    public void crearProject (Project prj);
    public void borrarProject (Long id);
    public Project buscarProject (Long id);
    
}
