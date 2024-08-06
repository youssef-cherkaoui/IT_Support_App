package com.example.it_support.Service;

import com.example.it_support.Model.EquipementModel;
import com.example.it_support.Repository.EquipementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipementServiceImpl implements EquipementService{

    @Autowired
    private EquipementRepository equipementRepository;

    @Override
    public EquipementModel CreateEquipement(EquipementModel equipement) {
        return equipementRepository.save(equipement);
    }


    @Override
    public List<EquipementModel> getAllEquipements() {
        return equipementRepository.findAll();
    }


    @Override
    public void deleteEquipements(Long idEquipement) {
        equipementRepository.deleteById(idEquipement);
    }

    @Override
    public EquipementModel updateEquipements(EquipementModel equipement,Long idequipement){

        Optional<EquipementModel> existingEquipement = equipementRepository.findById(idequipement);
        if(existingEquipement.isPresent()){
            EquipementModel equipToUpdate = existingEquipement.get();
            equipToUpdate.setNom(equipement.getNom());
            equipToUpdate.setDescription(equipement.getDescription());
            equipToUpdate.setEtatEquipement(equipement.getEtatEquipement());
            equipToUpdate.setDateAquisation(equipement.getDateAquisation());
            return equipementRepository.save(equipToUpdate);

        }else{
            throw new RuntimeException("Non trouvé"+idequipement);
        }
    }


}
