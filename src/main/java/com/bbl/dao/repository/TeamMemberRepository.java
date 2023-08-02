package com.bbl.dao.repository;

import com.bbl.dao.entities.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeamMemberRepository extends JpaRepository<TeamMember, Integer> {
}
