package com.example.it_support.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipementModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idequipement ;
    private String nom ;
    private String description ;
    private String DateAquisation;
}
