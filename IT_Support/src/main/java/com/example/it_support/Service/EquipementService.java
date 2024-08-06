package com.example.it_support.Service;

import com.example.it_support.Model.EquipementModel;

import java.util.List;

public interface EquipementService {

    EquipementModel CreateEquipement(EquipementModel equipement);
    List<EquipementModel> getAllEquipements();
    void deleteEquipements(Long idEquipement);
    EquipementModel updateEquipements(EquipementModel equipement,Long idequipement);
}
