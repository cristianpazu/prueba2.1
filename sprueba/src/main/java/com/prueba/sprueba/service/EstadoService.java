package com.prueba.sprueba.service;

import com.prueba.sprueba.model.Cliente;
import com.prueba.sprueba.model.Estado;
import com.prueba.sprueba.repository.ClienteRespositoory;
import com.prueba.sprueba.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService implements EstadoServices{
    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public Estado create(Estado estado) {
        return estadoRepository.save(estado);
    }

    @Override
    public Estado update(Estado estado) {
        return estadoRepository.save(estado);
    }

    @Override
    public Estado findById(Long idEstado) {
        Optional<Estado> estadoOptional= estadoRepository.findById(idEstado);
        return  estadoOptional.orElse(null);
    }

    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    @Override
    public void delete(Long idEstado) {
        estadoRepository.deleteById(idEstado);
    }
}
