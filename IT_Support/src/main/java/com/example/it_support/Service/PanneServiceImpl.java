package com.example.it_support.Service;


import com.example.it_support.Model.Panne;
import com.example.it_support.Repository.EquipementRepository;
import com.example.it_support.Repository.PanneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanneServiceImpl implements PanneService {

    @Autowired
    private PanneRepository panneRepository;

    @Autowired
    private EquipementRepository equipementRepository;

    @Override
    public Panne AddPanne(Panne panne){
        Panne savedPanne = panneRepository.save(panne);
        return  savedPanne;
    }

    @Override
    public List<Panne> getAllPanne(){
        return panneRepository.findAll();
    }

    @Override
    public void deletePanne(Long idPanne){
        equipementRepository.deleteById(idPanne);
    }

    @Override
    public Panne updatePanne(Long id, Panne EtatPanne){
        Panne panne = panneRepository.findById(id).orElseThrow(() -> new RuntimeException("panne non trouvée"));
        panne.setDescription(EtatPanne.getDescription());
        panne.setEtatPanne(EtatPanne.getEtatPanne());

        Panne updatedPanne = panneRepository.save(panne);
        return updatedPanne;
    }

}
