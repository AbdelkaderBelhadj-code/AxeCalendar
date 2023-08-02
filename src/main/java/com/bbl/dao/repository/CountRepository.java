package com.bbl.dao.repository;

import com.bbl.dao.entities.Count;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountRepository extends JpaRepository<Count,Integer> {
}
