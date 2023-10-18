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
@Table(name = "PROVEEDOR")
public class proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
    @Column(name = "IDPROVEEDOR")
    private Long idProveedor;

    @Column(name = "NOMBRE_PROVEEDOR")
    private String nombreProveedor;

    @ManyToOne
    @JoinColumn(name = "IDPRODUCTOP", referencedColumnName = "IDPRODUCTOP")
    private productoProveedor productoProveedor;

    @OneToOne
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
    private persona persona;

    // Getters y Setters

    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public productoProveedor getProductoProveedor() {
        return productoProveedor;
    }

    public void setProductoProveedor(productoProveedor productoProveedor) {
        this.productoProveedor = productoProveedor;
    }

    public persona getPersona() {
        return persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }
}

