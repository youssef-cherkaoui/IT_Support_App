package com.example.it_support.Model;

import com.example.it_support.Enum.EtatPanne;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Panne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpanne;
    private String description;
    private String dateSignalement;
    @Enumerated(EnumType.STRING)
    private EtatPanne etatPanne;

    @OneToMany(mappedBy = "panne" , cascade = CascadeType.ALL)
    private List<TicketModel> ticketModels;

    @OneToMany(mappedBy = "panne")
    private List<HistoriqueModel> historiqueModels;
}
