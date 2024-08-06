package com.example.it_support.Controller;


import com.example.it_support.Model.EquipementModel;
import com.example.it_support.Service.EquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth/Admin")
public class EquipementController {

    @Autowired
    private EquipementService equipementService;

    @PostMapping("/CreateEquipement")
    public EquipementModel CreateEquipement(@RequestBody EquipementModel equipement) {
        return equipementService.CreateEquipement(equipement);
    }

    @GetMapping("/ShowAll")
    public List<EquipementModel> getAllEquipements() {
        return equipementService.getAllEquipements();
    }

    @DeleteMapping("/{idEquipement}")
    public void deleteEquipements(@PathVariable Long idEquipement) {
        equipementService.deleteEquipements(idEquipement);
    }

    @PutMapping("/equipPut/{idEquipement}")
    public EquipementModel updateEquipements(@PathVariable Long idEquipement, @RequestBody EquipementModel equipement) {
        return equipementService.updateEquipements(equipement, idEquipement);
    }
}
