package com.bbl.service.interfaces;

import com.bbl.dao.entities.Timeoff;

import java.util.List;

public interface ITimeoffService {
    Timeoff addTimeOff(Timeoff timeoff);
    public void DeleteTimeOff(int id);
    public List<Timeoff> DisplayAllTimeOffs();
    public Timeoff displayTimeId(int id);
    
}
