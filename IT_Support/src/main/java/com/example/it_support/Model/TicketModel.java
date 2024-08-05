package com.example.it_support.Model;


import com.example.it_support.Enum.EtatTicket;
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
public class TicketModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String DateCreation;
    @Enumerated(EnumType.STRING)
    private EtatTicket ticket;

    @ManyToOne
    @JoinColumn(name = "id_tech")
    private TechnicienModel technicienModel;

    @ManyToOne
    @JoinColumn(name = "id_utili")
    private UtilisateurModel utilisateurModel;



}
