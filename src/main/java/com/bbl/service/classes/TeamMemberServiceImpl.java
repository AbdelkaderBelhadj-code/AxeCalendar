package com.bbl.service.classes;


import com.bbl.dao.entities.TeamMember;
import com.bbl.dao.repository.TeamMemberRepository;

import com.bbl.service.interfaces.ITeamMemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeamMemberServiceImpl implements ITeamMemberServiceImpl {
    @Autowired
    private TeamMemberRepository teamMemberRepository;



    @Override
    public TeamMember addTeamMember(TeamMember teamMember) {
        return teamMemberRepository.save(teamMember);
    }

    @Override
    public List<TeamMember> DisplayAllTeamMember() {
        return teamMemberRepository.findAll();

    }


    @Override
    public void DeleteTeamMember(int id) {
        teamMemberRepository.delete(teamMemberRepository.getById(id));

    }
    
    @Override
    public TeamMember displayTeamMemberById(int id) {
        return teamMemberRepository.findById(id).get();
    }
    
}
