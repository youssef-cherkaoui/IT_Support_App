package com.example.it_support.Model;

import com.example.it_support.Enum.EtatEquipement;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EquipementModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idequipement ;
    private String nom ;
    private String description ;
    private String DateAquisation;
    @Enumerated(EnumType.STRING)
    private EtatEquipement etatEquipement ;


}
