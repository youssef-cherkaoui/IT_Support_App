package com.example.it_support.Model;

import com.example.it_support.Enum.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("TECHNICIEN")
public class TechnicienModel extends PersonneModel{


    @OneToMany

            (mappedBy = "technicienModels", cascade = CascadeType.ALL)

    private List<TicketModel> ticketModels;

    public TechnicienModel(Long id, String nom, String email, String motdepasse, Role role) {
        super(id, nom, email, motdepasse, role);
        this.setRole(Role.TECHNICIEN);
    }
}
