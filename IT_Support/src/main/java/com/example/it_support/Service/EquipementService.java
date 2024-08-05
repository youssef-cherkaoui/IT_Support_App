package com.example.it_support.Service;

import com.example.it_support.Model.EquipementModel;

import java.util.List;

public interface EquipementService {

    EquipementModel createEquipement(EquipementModel equipement);
    List<EquipementModel> getAllEquipements();
    void  deleteEquipement(Long id);
    EquipementModel editEquipement(EquipementModel equipement , Long id);

    }
