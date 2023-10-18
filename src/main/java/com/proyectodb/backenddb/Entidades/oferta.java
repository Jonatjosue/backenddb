package com.proyectodb.backenddb.Entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name = "OFERTA")
public class oferta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
    @Column(name = "IDOFERTA")
    private Long idoferta;

    @Column(name = "FECHA_EMITIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmitida;

    @Column(name = "OF_INICIO")
    private Date inicioOferta;

    @Column(name = "OF_FIN")
    private Date finOferta;

    @Column(name = "DESCUENTO")
    private Double descuento;

    // Getters y Setters

    public Long getIdoferta() {
        return idoferta;
    }

    public void setIdoferta(Long idoferta) {
        this.idoferta = idoferta;
    }

    public Date getFechaEmitida() {
        return fechaEmitida;
    }

    public void setFechaEmitida(Date fechaEmitida) {
        this.fechaEmitida = fechaEmitida;
    }

    public Date getInicioOferta() {
        return inicioOferta;
    }

    public void setInicioOferta(Date inicioOferta) {
        this.inicioOferta = inicioOferta;
    }

    public Date getFinOferta() {
        return finOferta;
    }

    public void setFinOferta(Date finOferta) {
        this.finOferta = finOferta;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
}
