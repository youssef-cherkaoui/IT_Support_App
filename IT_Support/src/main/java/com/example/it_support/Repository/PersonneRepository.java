package com.example.it_support.Repository;

import com.example.it_support.Model.PersonneModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface PersonneRepository extends JpaRepository<PersonneModel, Long> {
    Optional<PersonneModel> findByEmail(String email);
}
