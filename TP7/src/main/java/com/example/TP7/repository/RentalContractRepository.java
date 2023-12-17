package com.example.TP7.repository;

import com.example.TP7.entity.RentalContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalContractRepository extends JpaRepository<RentalContract, Long> {

}
