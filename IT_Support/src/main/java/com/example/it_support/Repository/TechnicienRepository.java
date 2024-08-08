package com.example.it_support.Repository;

import com.example.it_support.Model.PersonneModel;
import com.example.it_support.Model.TechnicienModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TechnicienRepository extends JpaRepository<TechnicienModel,Long> {
}
