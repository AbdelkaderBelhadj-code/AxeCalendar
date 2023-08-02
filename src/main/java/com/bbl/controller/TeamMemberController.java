    package com.bbl.controller;
    
    import com.bbl.dao.entities.TeamMember;
    import com.bbl.service.interfaces.ITeamMemberServiceImpl;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @RequestMapping("/team")
    
    public class TeamMemberController {
        @Autowired
        private ITeamMemberServiceImpl teamMemberService;
        
        @PostMapping("/addteamM")
        public TeamMember addTeamMember(@RequestBody TeamMember teamMember) {
            return teamMemberService.addTeamMember(teamMember);
            
        }
        @DeleteMapping("/delete/{idT}")
        public void deleteTeamMember(@PathVariable("idT") int id){
             teamMemberService.DeleteTeamMember(id);
        }
        
        @GetMapping("/DisplayTeam/{idT}")
        public void getteamemberbyid(@PathVariable("idT")int id){
             teamMemberService.displayTeamMemberById(id);
        }
        
        @GetMapping("/findAll")
        public List<TeamMember> displayAllTeamMember() {
            return teamMemberService.DisplayAllTeamMember();
        }
        
    }
