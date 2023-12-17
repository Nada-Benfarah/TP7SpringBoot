package com.example.TP7.repository;


import com.example.TP7.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property,
        Long> {
}