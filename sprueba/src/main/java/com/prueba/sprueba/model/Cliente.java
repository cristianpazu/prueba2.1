package com.prueba.sprueba.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(name = "nombre", nullable = false, length = 200)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 200)
    private String apellido;

    @Column(name = "direccion", nullable = false, length = 200)
    private String direccion;

    @Column(name = "email", nullable = false, length = 200)
    private String email;

    @Column(name = "telefono", nullable = false, length = 200)
    private String telefono;

    @Column(name = "idProducto", nullable = false)
    private Long idProducto;

    @Column(name = "idEstado", nullable = false)
    private Long idEstado;

}
