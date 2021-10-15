package com.prueba.sprueba.repository;

import com.prueba.sprueba.model.Surcursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurcursalRepository extends JpaRepository<Surcursal, Long> {
}
