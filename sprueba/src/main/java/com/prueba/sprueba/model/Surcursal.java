package com.prueba.sprueba.model;

import javax.persistence.*;

@Entity
@Table(name = "surcursal")
public class Surcursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @Column(name = "nameProducto", nullable = false, length = 200)
    private String nombreProducto;

    @Column(name = "referencia", nullable = false, length = 200)
    private String referencia;



    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
