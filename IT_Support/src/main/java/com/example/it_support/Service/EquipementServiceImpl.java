package com.example.it_support.Service;


import com.example.it_support.Model.EquipementModel;
import com.example.it_support.Repository.EquipementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipementServiceImpl implements EquipementService{

    @Autowired
    private EquipementRepository equipementRepository;

    @Override
    public EquipementModel createEquipement(EquipementModel equipement){
        return equipementRepository.save(equipement);
    }

    @Override
    public List<EquipementModel> getAllEquipements(){
        return equipementRepository.findAll();
    }

    @Override
    public EquipementModel editEquipement(EquipementModel equipement , Long id){
        equipementRepository.findById(id);
        EquipementModel editEquipement = new EquipementModel();
        editEquipement.setIdequipement(id);
        editEquipement.setNom(equipement.getNom());
        editEquipement.setDescription(equipement.getDescription());
        editEquipement.setDateAquisation(equipement.getDateAquisation());

        return equipementRepository.save(editEquipement);
    }

    @Override
    public void deleteEquipement(Long id){
        equipementRepository.deleteById(id);
    }
}
