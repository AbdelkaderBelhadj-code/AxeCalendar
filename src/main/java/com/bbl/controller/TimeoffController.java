package com.bbl.controller;

import com.bbl.dao.entities.TeamMember;
import com.bbl.dao.entities.Timeoff;
import com.bbl.service.interfaces.ITimeoffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/timeoff")

public class TimeoffController {
    @Autowired
    private ITimeoffService iTimeoffService;

    @PostMapping("/addtimeoff")
    public Timeoff addTeamMember(@RequestBody Timeoff timeoff) {
        return iTimeoffService.addTimeOff(timeoff);

    }
    @DeleteMapping("/delete/{idT}")
    public void deleteTimeOff(@PathVariable("idT") int id){
        iTimeoffService.DeleteTimeOff(id);
    }

    @GetMapping("/DisplayTime/{idT}")
    public void gettimeoffbyid(@PathVariable("idT")int id){
        iTimeoffService.displayTimeId(id);
    }

    @GetMapping("/findAll")
    public List<Timeoff> displayAlltimeOffs() {
        return iTimeoffService.DisplayAllTimeOffs();
    }
}
