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
@Table(name = "SUCURSAL")
public class sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
    @Column(name = "IDSUCURSAL")
    private Long idsucursal;

    @Column(name = "NOMBRE_SUCURSAL")
    private String nombreSucursal;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "CONTACTO")
    private String contacto;

    @ManyToOne
    @JoinColumn(name = "IDLOCALIDAD", referencedColumnName = "IDLOCALIDAD")
    private departamento localidad;

    // Getters y Setters

    public Long getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(Long idsucursal) {
        this.idsucursal = idsucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public departamento getLocalidad() {
        return localidad;
    }

    public void setLocalidad(departamento localidad) {
        this.localidad = localidad;
    }
}


