package com.example.it_support.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HistoriqueModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idhistorique ;
    private String date ;

    @ManyToOne
    @JoinColumn(name = "equip_id" , nullable = false)
    private EquipementModel equipementModels;

    @ManyToOne
    @JoinColumn(name ="panne_id" , nullable = false)
    private Panne panne;
}
