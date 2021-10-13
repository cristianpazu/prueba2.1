package com.prueba.sprueba.service;

import com.prueba.sprueba.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente create(Cliente cliente);

    Cliente update(Cliente cliente);

    Cliente findById(Long idCliente);

    List<Cliente> findAll();

    void delete(Long idCliente); //aqui se coloc void pq no nos devuelve nada
}
