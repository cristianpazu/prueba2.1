package com.prueba.sprueba.repository;

import com.prueba.sprueba.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRespository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByIdCliente(Long idCliente);

}
