package com.ctrlaltelite.planitbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctrlaltelite.planitbudget.entity.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
    
}
