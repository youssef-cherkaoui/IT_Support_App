package com.example.it_support.Model;

import com.example.it_support.Enum.Role;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("TECHNICIEN")
public class TechnicienModel extends PersonneModel{

    public TechnicienModel(Long id, String nom, String email, String motdepasse, Role role) {
        super(id, nom, email, motdepasse, role);
        this.setRole(Role.TECHNICIEN);
    }
}
