package com.bbl.service.classes;

import com.bbl.dao.entities.Timeoff;
import com.bbl.dao.repository.TimeoffRepository;
import com.bbl.service.interfaces.ITimeoffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TimeOffServiceImpl implements ITimeoffService {
    @Autowired
    private TimeoffRepository timeoffRepository;
    
    @Override
    public Timeoff addTimeOff(Timeoff timeoff) {
        return timeoffRepository.save(timeoff);

    }

    @Override
    public void DeleteTimeOff(int id) {
        timeoffRepository.delete(timeoffRepository.getById(id));
    }

    @Override
    public List<Timeoff> DisplayAllTimeOffs() {
        return timeoffRepository.findAll();
    }

    @Override
    public Timeoff displayTimeId(int id) {
        return timeoffRepository.findById(id).get();
    }
}
