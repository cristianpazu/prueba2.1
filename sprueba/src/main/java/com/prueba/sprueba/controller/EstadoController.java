package com.prueba.sprueba.controller;

import com.prueba.sprueba.model.Estado;
import com.prueba.sprueba.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado")
public class EstadoController {
    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public List<Estado> findAll(){
        return  estadoService.findAll();//nos retorna un lista de servici
    }
    @PostMapping
    public Estado create(@RequestBody Estado Estado){
        return estadoService.create(Estado);
    }

}
