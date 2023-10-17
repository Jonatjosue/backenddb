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
@Table(name = "PRODUCTO")
public class producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(name = "IDPRODUCTO")
    private Long idproducto;

    @Column(name = "EXISTENCIA")
    private Long existencia;

    @Column(name = "PRECIO_UNITARIO")
    private Double precioUnitario;

    @Column(name = "PRECIO_COSTO")
    private Double precioCosto;

    @Column(name = "PRECIO_OFERTA")
    private Double precioOferta;

    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;

    @Column(name = "CATEGORIA_PRODUCTO")
    private String categoriaProducto;

    @ManyToOne
    @JoinColumn(name = "IDESTADO", referencedColumnName = "IDESTADO")
    private estado estado;

    @ManyToOne
    @JoinColumn(name = "IDOFERTA", referencedColumnName = "IDOFERTA")
    private oferta oferta;

    // Getters y Setters

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }

    public Long getExistencia() {
        return existencia;
    }

    public void setExistencia(Long existencia) {
        this.existencia = existencia;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(Double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public estado getEstado() {
        return estado;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }

    public oferta getOferta() {
        return oferta;
    }

    public void setOferta(oferta oferta) {
        this.oferta = oferta;
    }
}

