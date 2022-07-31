/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.backporfolio.service;

import com.app.backporfolio.model.Project;
import com.app.backporfolio.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService{
    @Autowired
    public ProjectRepository prjRepo;
    @Override
    public List<Project> verProject() {
        return prjRepo.findAll();
    }

    @Override
    public void crearProject(Project prj) {
        prjRepo.save(prj);
    }

    @Override
    public void borrarProject(Long id) {
        prjRepo.deleteById(id);
    }

    @Override
    public Project buscarProject(Long id) {
        return prjRepo.findById(id).orElse(null);
    }
    
}
