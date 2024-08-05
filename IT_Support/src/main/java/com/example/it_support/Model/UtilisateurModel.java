package com.example.it_support.Model;


import com.example.it_support.Enum.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("UTILISATEUR")
public class UtilisateurModel extends PersonneModel {

    public UtilisateurModel(Long id, String nom, String email, String motdepasse, Role role) {
        super(id, nom, email, motdepasse, role);
        this.setRole(Role.UTILISATEUR);
    }

}
