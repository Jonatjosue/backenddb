package com.proyectodb.backenddb.Entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
    @Column(name = "IDCLIENTE")
    private Long idCliente;

    @ManyToOne
    @JoinColumn(name = "IDHISTORIALC", referencedColumnName = "IDHISTORIALC")
    private historialCompra historialCompra;

     @ManyToOne
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
    private persona persona;

    // Getters y Setters

    public void setPersona(persona persona) {
        this.persona = persona;
    }

    public persona getPersona() {
        return persona;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public historialCompra getHistorialCompra() {
        return historialCompra;
    }

    public void setHistorialCompra(historialCompra historialCompra) {
        this.historialCompra = historialCompra;
    }
}
