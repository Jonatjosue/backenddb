package com.proyectodb.backenddb.Entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "HISTORIAL_COMPRA")
public class historialCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
    @Column(name = "IDHISTORIALC")
    private Long idHistorialC;

    @ManyToOne
    @JoinColumn(name = "IDFACTURA", referencedColumnName = "IDFACTURA")
    private factura factura;

    // Getters y Setters

    public Long getIdHistorialC() {
        return idHistorialC;
    }

    public void setIdHistorialC(Long idHistorialC) {
        this.idHistorialC = idHistorialC;
    }

    public factura getFactura() {
        return factura;
    }

    public void setFactura(factura factura) {
        this.factura = factura;
    }
}

