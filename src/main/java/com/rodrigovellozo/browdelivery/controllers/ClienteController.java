package com.rodrigovellozo.browdelivery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rodrigovellozo.browdelivery.models.Cliente;
import com.rodrigovellozo.browdelivery.repositories.ClienteRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    private final String CLIENTE_URI = "clientes/";
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/")
    public ModelAndView listagemClientes(){
        Iterable<Cliente> clientes = clienteRepository.findAll();
        return  new ModelAndView(CLIENTE_URI + "list", "clientes", clientes);  
    }
}
