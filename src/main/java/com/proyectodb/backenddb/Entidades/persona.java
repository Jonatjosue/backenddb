package com.proyectodb.backenddb.Entidades;
//import java.sql.Date;

import java.util.Date;

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
@Table(name = "PERSONA")
public class persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(name = "IDPERSONA")
    private Long idPersona;

    @Column(name = "NOMBRES")
    private String nombres;

    @Column(name = "APELLIDOS")
    private String apellidos;

    @Column(name = "FECHANACIMIENTO")
    private Date fechaNacimiento;

    @Column(name = "NUMERO_TELEFONO")
    private Long numeroTelefono;

    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;

    @Column(name = "NIT")
    private String nit;

    @Column(name = "GENERO")
    private String genero;

    @Column(name = "CUI")
    private Long cui;

    @ManyToOne
    @JoinColumn(name = "ID_IDENTIFICACION", referencedColumnName = "ID_IDENTIFICACION")
    private docIdentificacion docIdentificacion;

    @OneToOne(mappedBy = "persona")
    private cliente cliente;

    @OneToOne(mappedBy = "persona")
    private empleado empleado;

    @OneToOne(mappedBy = "persona")
    private proveedor proveedor;

    // Getters y Setters

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(Long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getCui() {
        return cui;
    }

    public void setCui(Long cui) {
        this.cui = cui;
    }

    public docIdentificacion getDocIdentificacion() {
        return docIdentificacion;
    }

    public void setDocIdentificacion(docIdentificacion docIdentificacion) {
        this.docIdentificacion = docIdentificacion;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(empleado empleado) {
        this.empleado = empleado;
    }

    public proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
