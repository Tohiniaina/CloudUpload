/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codex.tomobilina.services;

import com.codex.tomobilina.models.NbAnnonceLastWeek;
import com.codex.tomobilina.models.NbAnnonceWeek;
import com.codex.tomobilina.models.NbUsersWeek;
import com.codex.tomobilina.models.Stat_AnnonceUser;
import com.codex.tomobilina.models.Stat_PrixCommission;
import com.codex.tomobilina.models.VenteLastWeek;
import com.codex.tomobilina.models.VenteWeek;
import com.codex.tomobilina.repository.AnnonceRepository;
import com.codex.tomobilina.repository.CommissionRepository;
import com.codex.tomobilina.repository.Stat_PrixCommissionRepository;
import com.codex.tomobilina.repository.UserRepository;
import com.codex.tomobilina.repository.VenteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tohy
 */

@Service
public class StatistiqueService {
    @Autowired
    UserRepository userRepository;
    
    @Autowired
    VenteRepository venteRepository;
    
    @Autowired
    AnnonceRepository annonceRepository;
    
    @Autowired
    CommissionRepository commissionRepository;
    
    @Autowired
    Stat_PrixCommissionRepository stat_PrixCommissionRepository;
    
    public int getNbUsersLastWeek() {
        return userRepository.findNbrUserLastWeek();
    }
    
    public NbUsersWeek getNbUsersWeek() {
        return userRepository.findNbrUserWeek();
    }
    
    public VenteLastWeek getVenteLastWeek() {
        return venteRepository.findVenteLastWeek();
    }
    
    public VenteWeek getVenteWeek() {
        return venteRepository.findVenteWeek();
    }
    
    public NbAnnonceLastWeek getNbAnnonceLastWeek() {
        return annonceRepository.findNbAnnonceLastWeek();
    }
    
    public NbAnnonceWeek getNbAnnonceWeek() {
        return annonceRepository.findNbAnnonceWeek();
    }
    
    public List<Stat_PrixCommission> getAllStat_PrixCommission() {
        return stat_PrixCommissionRepository.findAll();
    }
    
    public Stat_PrixCommission getAllStat_PrixCommissionByMois(int mois) {
        return stat_PrixCommissionRepository.findByMois(mois);
    }
    
    public List<Stat_AnnonceUser> getStat_AnnonceUser() {
        return userRepository.findStat_AnnonceUser();
    }
}
