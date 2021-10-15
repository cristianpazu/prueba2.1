package com.prueba.sprueba.controller;

import com.prueba.sprueba.model.Cliente;
import com.prueba.sprueba.model.Surcursal;
import com.prueba.sprueba.service.SurcursalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/surcursal")//url base para ingresar
public class SurcursalController {

    @Autowired
    private SurcursalServices surcursalServices;

     @GetMapping
    public List<Surcursal> findAll(){
        return  surcursalServices.findAll();//nos retorna un lista de servici
    }
    @PostMapping
    public Surcursal create(@RequestBody Surcursal surcursal){
        return surcursalServices.create(surcursal);
    }

}
