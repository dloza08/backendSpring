/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.backporfolio.controller;

import com.app.backporfolio.model.Educacion;
import com.app.backporfolio.model.Experiencia;
import com.app.backporfolio.model.Profile;
import com.app.backporfolio.model.Project;
import com.app.backporfolio.model.Skill;
import com.app.backporfolio.service.IEducacionService;
import com.app.backporfolio.service.IExperienciaService;
import com.app.backporfolio.service.IProfileService;
import com.app.backporfolio.service.IProjectService;
import com.app.backporfolio.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "*", maxAge = 3600)
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class Controller {

    //Educacion
    @Autowired
    private IEducacionService eduSer;

    @GetMapping("/listar/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduSer.verEducacion();
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @PostMapping("/new/educacion")

    public void agregarEducacion(@RequestBody Educacion ed) {
        eduSer.crearEducacion(ed);
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @GetMapping("/buscar/educacion/{id}")

    public Educacion buscarEducacionDTO(@PathVariable Long id) {
        return eduSer.buscarEducacion(id);
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @DeleteMapping("/delete/educacion/{id}")

    public void borrarEducacion(@PathVariable Long id) {
        eduSer.borrarEducacion(id);
    }

    //Experiencia
    @Autowired
    private IExperienciaService expSer;

    @GetMapping("/listar/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expSer.verExperiencia();
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @PostMapping("/new/experiencia")

    public void agregarExperiencia(@RequestBody Experiencia exp) {
        expSer.crearExperiencia(exp);
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @GetMapping("/buscar/experiencia/{id}")

    public Experiencia buscarExperienciaDTO(@PathVariable Long id) {
        return expSer.buscarExperiencia(id);
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @DeleteMapping("/delete/experiencia/{id}")

    public void borrarExperiencia(@PathVariable Long id) {
        expSer.borrarExperiencia(id);
    }

    //Profile
    @Autowired
    private IProfileService proSer;

    @GetMapping("/listar/profile")
    @ResponseBody
    public List<Profile> verProfile() {
        return proSer.verProfile();
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @PostMapping("/new/profile")

    public void agregarProfile(@RequestBody Profile pro) {
        proSer.crearProfile(pro);
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @GetMapping("/buscar/profile/{id}")

    public Profile buscarProfileDTO(@PathVariable Long id) {
        return proSer.buscarProfile(id);
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @DeleteMapping("/delete/profile/{id}")

    public void borrarProfile(@PathVariable Long id) {
        proSer.borrarProfile(id);
    }
    //Skill
    @Autowired
    private ISkillService skiSer;

    @GetMapping("/listar/skill")
    @ResponseBody
    public List<Skill> verSkill() {
        return skiSer.verSkill();
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @PostMapping("/new/skill")

    public void agregarSkill(@RequestBody Skill ski) {
        skiSer.crearSkill(ski);
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @GetMapping("/buscar/skill/{id}")

    public Skill buscarSkillDTO(@PathVariable Long id) {
        return skiSer.buscarSkill(id);
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @DeleteMapping("/delete/skill/{id}")

    public void borrarSkill(@PathVariable Long id) {
        skiSer.borrarSkill(id);
    }

    //Project
    @Autowired
    private IProjectService prjSer;

    @GetMapping("/listar/project")
    @ResponseBody
    public List<Project> verProject() {
        return prjSer.verProject();
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @PostMapping("/new/project")

    public void agregarProject(@RequestBody Project prj) {
        prjSer.crearProject(prj);
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @GetMapping("/buscar/project/{id}")

    public Project buscarProjectDTO(@PathVariable Long id) {
        return prjSer.buscarProject(id);
    }

    //@PreAuthorize("hasRole('ADMIN')") usuario con rol admin esta autorizado realizar esta acción
    @DeleteMapping("/delete/project/{id}")

    public void borrarProject(@PathVariable Long id) {
        prjSer.borrarProject(id);
    }

}
