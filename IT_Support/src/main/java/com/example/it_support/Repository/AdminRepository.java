package com.example.it_support.Repository;

import com.example.it_support.Model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminModel, Long> {
}
