package com.prueba.sprueba.model;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

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

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Surcursal surcursal;

    @ManyToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Surcursal getSurcursal() {
        return surcursal;
    }

    public void setSurcursal(Surcursal surcursal) {
        this.surcursal = surcursal;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
