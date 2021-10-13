package com.prueba.sprueba.service;

import com.prueba.sprueba.model.Cliente;
import com.prueba.sprueba.repository.ClienteRespositoory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServices implements ClienteService {
    //gestiona las operaciones del negocio
    //vamos aplicar ineccion de indepencia
@Autowired
    private ClienteRespositoory clienteRespositoory;


    @Override
    public Cliente create(Cliente cliente) {
        return clienteRespositoory.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRespositoory.save(cliente);

    }

    @Override
    public Cliente findById(Long idCliente) {
       Optional<Cliente> clienteOptional= clienteRespositoory.findById(idCliente);
        return  clienteOptional.orElse(null);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRespositoory.findAll();
    }

    @Override
    public void delete(Long idCliente) {


        clienteRespositoory.deleteById(idCliente);

    }


}
