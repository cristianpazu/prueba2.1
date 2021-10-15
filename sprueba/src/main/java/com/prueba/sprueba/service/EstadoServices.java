package com.prueba.sprueba.service;

import com.prueba.sprueba.model.Cliente;
import com.prueba.sprueba.model.Estado;

import java.util.List;

public interface EstadoServices {
    Estado create(Estado estado);

    Estado update(Estado estado);

    Estado findById(Long idEstado);

    List<Estado> findAll();

    void delete(Long idEstado); //aqui se coloc void pq no nos devuelve nada

}



