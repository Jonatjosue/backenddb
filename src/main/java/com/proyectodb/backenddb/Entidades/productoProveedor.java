package com.proyectodb.backenddb.Entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTO_PROVEEDOR")
public class productoProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
    @Column(name = "IDPRODUCTOP")
    private Long idProductoP;

    @Column(name = "NOMBRE_PROVEEDOR")
    private String nombreProveedor;

    // Getters y Setters

    public Long getIdProductoP() {
        return idProductoP;
    }

    public void setIdProductoP(Long idProductoP) {
        this.idProductoP = idProductoP;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
}

