package com.example.it_support.Service;

import com.example.it_support.Model.Panne;

import java.util.List;

public interface PanneService {

    Panne AddPanne(Panne panne);
    List<Panne> getAllPanne();
    void deletePanne(Long idPanne);
    Panne updatePanne(Long id, Panne EtatPanne);

}
