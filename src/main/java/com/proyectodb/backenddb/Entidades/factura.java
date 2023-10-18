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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name = "FACTURA")
public class factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
    @Column(name = "IDFACTURA")
    private Long idfactura;

    @Column(name = "FECHA_EMITIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmitida;

    @Column(name = "TOTAL_PAGO")
    private Double totalPago;

    @ManyToOne
    @JoinColumn(name = "IDTIPOPAGO", referencedColumnName = "IDTIPOPAGO")
    private tipoPago tipoPago;

    @ManyToOne
    @JoinColumn(name = "ID_DETALLE_FACTURA", referencedColumnName = "ID_DETALLE_FACTURA")
    private detalleFactura detalleFactura;

    // Getters y Setters

    public Long getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Long idfactura) {
        this.idfactura = idfactura;
    }

    public Date getFechaEmitida() {
        return fechaEmitida;
    }

    public void setFechaEmitida(Date fechaEmitida) {
        this.fechaEmitida = fechaEmitida;
    }

    public Double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(Double totalPago) {
        this.totalPago = totalPago;
    }

    public tipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(tipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public detalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(detalleFactura detalleFactura) {
        this.detalleFactura = detalleFactura;
    }
}

