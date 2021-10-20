package com.prueba.sprueba.service;

import com.prueba.sprueba.model.Estado;
import com.prueba.sprueba.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    private final EstadoRepository estadoRepository;

    @Autowired
    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public Estado create(Estado estado) {
        return estadoRepository.save(estado);
    }

    public Estado update(Estado estado) {
        return estadoRepository.save(estado);
    }

    public Estado findById(Long idEstado) {
        Optional<Estado> estadoOptional = estadoRepository.findByIdEstado(idEstado);
        return estadoOptional.orElse(null);
    }

    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    public void delete(Long idEstado) {
        estadoRepository.deleteById(idEstado);
    }
}
