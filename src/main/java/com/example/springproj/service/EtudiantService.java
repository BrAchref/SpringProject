package com.example.springproj.service;

import com.example.springproj.entity.Etudiant;
import com.example.springproj.repositories.EtudiantRepository;

import java.util.List;

public class EtudiantService implements iEtudiantService {
    EtudiantRepository er;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {

        return (List<Etudiant>) er.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return er.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return er.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return er.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        er.deleteById(idEtudiant);

    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return (List<Etudiant>) er.saveAll(etudiants);
    }
}
