package com.bbl.dao.repository;

import com.bbl.dao.entities.Timeoff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeoffRepository extends JpaRepository<Timeoff,Integer> {
}
