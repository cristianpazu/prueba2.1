package com.prueba.sprueba.service;

import com.prueba.sprueba.model.Surcursal;
import com.prueba.sprueba.repository.ClienteRespositoory;
import com.prueba.sprueba.repository.SurcursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurcursalService implements SurcursalServices {
    @Autowired
    private SurcursalRepository surcursalRepository;

    @Override
    public Surcursal create(Surcursal surcursal) {
        return surcursalRepository.save(surcursal);
    }

    @Override
    public Surcursal update(Surcursal surcursal) {
        return surcursalRepository.save(surcursal);
    }

    @Override
    public Surcursal findById(Long idProducto) {
        Optional<Surcursal> surcursalOptional= surcursalRepository.findById(idProducto);
        return surcursalOptional.orElse(null);
    }

    @Override
    public List<Surcursal> findAll() {
        return surcursalRepository.findAll();
    }

    @Override
    public void delete(Long idProducto) {
       surcursalRepository.deleteById(idProducto);
    }
}
