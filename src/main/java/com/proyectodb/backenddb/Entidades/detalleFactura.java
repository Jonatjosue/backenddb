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
@Table(name = "DETALLE_FACTURA")
public class detalleFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(name = "ID_DETALLE_FACTURA")
    private Long idDetalleFactura;

    @Column(name = "CANTIDAD_PRODUCTO")
    private Long cantidadProducto;

    @Column(name = "PRECIO_PRODUCTO")
    private Double precioProducto;

    @Column(name = "TOTAL_PRODUCTO")
    private Double totalProducto;

    @ManyToOne
    @JoinColumn(name = "IDPRODUCTO", referencedColumnName = "IDPRODUCTO")
    private producto producto;

    // Getters y Setters

    public Long getIdDetalleFactura() {
        return idDetalleFactura;
    }

    public void setIdDetalleFactura(Long idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public Long getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Long cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Double getTotalProducto() {
        return totalProducto;
    }

    public void setTotalProducto(Double totalProducto) {
        this.totalProducto = totalProducto;
    }

    public producto getProducto() {
        return producto;
    }

    public void setProducto(producto producto) {
        this.producto = producto;
    }
}

