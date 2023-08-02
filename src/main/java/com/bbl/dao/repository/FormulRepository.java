package com.bbl.dao.repository;

import com.bbl.dao.entities.Formule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormulRepository extends JpaRepository<Formule,Integer> {
    
}
