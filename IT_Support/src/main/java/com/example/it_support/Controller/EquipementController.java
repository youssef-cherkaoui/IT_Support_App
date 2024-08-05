package com.example.it_support.Controller;


import com.example.it_support.Model.EquipementModel;
import com.example.it_support.Service.EquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipement")
public class EquipementController {

    @Autowired
    private EquipementService equipementService;

    @PostMapping("/create")
    public EquipementModel createEquipement(@RequestBody EquipementModel equipement){
        return equipementService.createEquipement(equipement);
    }

    @GetMapping("/All")
    public List<EquipementModel> getAllEquipement(){
        return equipementService.getAllEquipements();
    }

    @PutMapping("/edit/{id}")
    public EquipementModel updateEquipement(@PathVariable Long id, @RequestBody EquipementModel equipement){
        return equipementService.editEquipement(equipement, id);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteEquipement(@PathVariable Long id){
        equipementService.deleteEquipement(id);
    }
}

