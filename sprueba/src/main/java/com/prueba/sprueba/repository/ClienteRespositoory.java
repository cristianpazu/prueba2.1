package com.prueba.sprueba.repository;

import com.prueba.sprueba.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRespositoory  extends JpaRepository<Cliente,Long> {


    /*@Query("SELECT suc"+
            "FROM Cliente AS suc"+
            "WHERE suc.idCliente")
    Optional<Cliente> findByClienteSucursal(@Param("idCliente") Long idCliente);
*/



}
