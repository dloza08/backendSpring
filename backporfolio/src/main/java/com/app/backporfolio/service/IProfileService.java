/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.backporfolio.service;

import com.app.backporfolio.model.Profile;
import java.util.List;

/**
 *
 * @author dario
 */
public interface IProfileService {
    public List<Profile> verProfile();
    public void crearProfile (Profile pro);
    public void borrarProfile (Long id);
    public Profile buscarProfile (Long id);
    
}
