package com.example.it_support.Model;

import com.example.it_support.Enum.EtatPanne;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PanneModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String dateSignalement;
    @Enumerated(EnumType.STRING)
    private EtatPanne etatPanne;

    @ManyToOne
    @JoinColumn(name = "id_equip")
    private EquipementModel equipementModel;
}
