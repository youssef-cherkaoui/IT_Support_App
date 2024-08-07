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
    @JoinColumn(name = "tech_id", nullable = false)
    private TechnicienModel technicienModels;

    @ManyToOne
    @JoinColumn(name = "utili_id" , nullable = false)
    private UtilisateurModel utili;

    @ManyToOne
    @JoinColumn(name = "ticket_id" , nullable = false)
    private TicketModel ticketModels;

    @ManyToOne
    @JoinColumn(name = "equip_id" , nullable = false)
    private EquipementModel equipementModels;


    @ManyToOne
    @JoinColumn(name = "panne_id" , nullable = false)
    private Panne panne;

}
