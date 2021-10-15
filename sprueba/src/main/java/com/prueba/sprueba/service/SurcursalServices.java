package com.prueba.sprueba.service;

import com.prueba.sprueba.model.Cliente;
import com.prueba.sprueba.model.Surcursal;

import java.util.List;

public interface SurcursalServices {
    Surcursal create(Surcursal surcursal);

    Surcursal update(Surcursal surcursal);

    Surcursal findById(Long idProducto);

    List<Surcursal> findAll();

    void delete(Long idProducto); //aqui se coloc void pq no nos devuelve nada
}
