package com.bbl.service.interfaces;

import com.bbl.dao.entities.TeamMember;

import java.util.List;

public interface ITeamMemberServiceImpl {
    TeamMember addTeamMember(TeamMember teamMember);
    public void DeleteTeamMember(int id);
    public List<TeamMember> DisplayAllTeamMember();
    public TeamMember displayTeamMemberById(int id);

}
