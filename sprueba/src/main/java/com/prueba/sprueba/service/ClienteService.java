package com.prueba.sprueba.service;

import com.prueba.sprueba.model.Cliente;
import com.prueba.sprueba.model.Estado;
import com.prueba.sprueba.model.Surcursal;
import com.prueba.sprueba.repository.ClienteRespository;
import com.prueba.sprueba.repository.EstadoRepository;
import com.prueba.sprueba.repository.SurcursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    //gestiona las operaciones del negocio - vamos aplicar ineccion de indepencia
    private final ClienteRespository clienteRespository;
    private final EstadoRepository estadoRepository;
    private final SurcursalRepository surcursalRepository;

    @Autowired
    public ClienteService(ClienteRespository clienteRespository, EstadoRepository estadoRepository, SurcursalRepository surcursalRepository) {
        this.clienteRespository = clienteRespository;
        this.estadoRepository = estadoRepository;
        this.surcursalRepository = surcursalRepository;
    }

    public Cliente createCliente(Cliente cliente) throws Exception {
        if (null == cliente || "".equals(cliente)) {
            throw new Exception("El objeto Cliente no pueden ser nulo");
        }

        Optional<Cliente> findCliente = clienteRespository.findByIdCliente(cliente.getIdCliente());
        Optional<Estado> findEstado = estadoRepository.findByIdEstado(cliente.getIdEstado());
        Optional<Surcursal> findSurcursal = surcursalRepository.findByIdProducto(cliente.getIdProducto());
        if (!findCliente.isPresent()) {
            if (findEstado.isPresent() && findSurcursal.isPresent()) {
                Cliente clienteResult = Cliente.builder()
                        .nombre(cliente.getNombre())
                        .apellido(cliente.getApellido())
                        .direccion(cliente.getDireccion())
                        .email(cliente.getEmail())
                        .telefono(cliente.getTelefono())
                        .idEstado(cliente.getIdEstado())
                        .idProducto(cliente.getIdProducto())
                        .build();
                return clienteRespository.save(clienteResult);
            } else {
                throw new Exception("La foranea de Estado o Sucursal no pueden ser nulo");
            }
        } else {
            throw new Exception("El objeto Cliente ya existe");
        }
    }

    public Cliente updateCliente(Cliente cliente) {
        return clienteRespository.save(cliente);
    }

    public Cliente findByIdCliente(Long idCliente) {
        Optional<Cliente> clienteOptional = clienteRespository.findByIdCliente(idCliente);
        return clienteOptional.orElse(null);
    }

    public List<Cliente> findAllClientes() {
        return clienteRespository.findAll();
    }

    public void deleteIdCliente(Long idCliente) {
        clienteRespository.deleteById(idCliente);
    }

}
