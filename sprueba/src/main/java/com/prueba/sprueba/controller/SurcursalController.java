package com.prueba.sprueba.controller;

import com.prueba.sprueba.model.Surcursal;
import com.prueba.sprueba.service.SurcursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/surcursal")//url base para ingresar
public class SurcursalController {

    @Autowired
    private SurcursalService surcursalService;

    @GetMapping
    public List<Surcursal> findAll() {
        return surcursalService.findAll();//nos retorna un lista de servici
    }

    @PostMapping
    public Surcursal create(@RequestBody Surcursal surcursal) {
        return surcursalService.create(surcursal);
    }

}
