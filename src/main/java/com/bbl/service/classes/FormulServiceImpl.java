package com.bbl.service.classes;
import com.bbl.dao.entities.Formule;
import com.bbl.dao.repository.FormulRepository;
import com.bbl.service.interfaces.IFormulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormulServiceImpl implements IFormulService {
    @Autowired
    FormulRepository formulRepository;




}
