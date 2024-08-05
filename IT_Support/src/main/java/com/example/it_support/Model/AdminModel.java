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
@Entity
@DiscriminatorValue("ADMIN")
public class AdminModel extends PersonneModel {


    public AdminModel(Long id, String nom, String email, String motdepasse, Role role) {
        super(id, nom, email, motdepasse, role);
        this.setRole(Role.ADMIN);
    }

    public AdminModel(){

    }
}
