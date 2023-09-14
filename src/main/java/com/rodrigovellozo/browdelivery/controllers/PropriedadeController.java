package com.rodrigovellozo.browdelivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigovellozo.browdelivery.models.Propriedade;
import com.rodrigovellozo.browdelivery.services.PropriedadeRepository;

@RestController()
public class PropriedadeController {
    
    @Autowired
    private PropriedadeRepository propriedadeRepository;
    
    @GetMapping("api/find/{filtro}")
    public List<Propriedade> findByFiltro(@PathVariable("filtro")String filtro){
        return this.propriedadeRepository.findByFiltro(filtro);
    }
    
}
