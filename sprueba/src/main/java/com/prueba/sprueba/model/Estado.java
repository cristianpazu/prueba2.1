package com.prueba.sprueba.model;

import javax.persistence.*;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idEstado;

    private String nombre;

    private  Surcursal surcursal;
}
