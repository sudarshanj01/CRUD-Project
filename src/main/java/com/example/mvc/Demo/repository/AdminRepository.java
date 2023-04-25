package com.example.mvc.Demo.repository;

import com.example.mvc.Demo.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Long> {

    Optional<Admin> findByEmailAndPassword(String email, String password);
}
