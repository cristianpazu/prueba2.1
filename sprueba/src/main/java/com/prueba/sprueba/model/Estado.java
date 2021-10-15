package com.prueba.sprueba.model;

import javax.persistence.*;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idEstado;

    @Column(name = "nombreEs", nullable = false, length = 200)
    private String nombreEs;
    @ManyToOne
    @JoinColumn(name = "idProducto")
    private  Surcursal surcursal;


    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEs() {
        return nombreEs;
    }

    public void setNombreEs(String nombreEs) {
        this.nombreEs = nombreEs;
    }


}
