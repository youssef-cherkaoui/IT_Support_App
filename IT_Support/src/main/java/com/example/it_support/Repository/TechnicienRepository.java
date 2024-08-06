package com.example.it_support.Repository;

import com.example.it_support.Model.TechnicienModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicienRepository extends JpaRepository<TechnicienModel,Long> {
}
