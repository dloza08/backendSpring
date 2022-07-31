/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.backporfolio.service;

import com.app.backporfolio.model.Profile;
import com.app.backporfolio.repository.ProfileRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService implements IProfileService{
    @Autowired
    public ProfileRepository proRepo;
    
    @Override
    public List<Profile> verProfile() {
        return proRepo.findAll();
    }

    @Override
    public void crearProfile(Profile pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProfile(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Profile buscarProfile(Long id) {
        return proRepo.findById(id).orElse(null);
    }
    
}
