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

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "EMPLEADO")
public class empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
    @Column(name = "IDEMPLEADO")
    private Long idEmpleado;

    @Column(name = "FECHA_INICIO")
    private Date fechaInicio;

    @Column(name = "SALARIO_BASE")
    private BigDecimal salarioBase;

    @Column(name = "PUESTO")
    private String puesto;

    @Column(name = "EDAD")
    private Integer edad;

    @ManyToOne
    @JoinColumn(name = "IDTURNO", referencedColumnName = "IDTURNO")
    private turnoEmpleado turnoEmpleado;

    @ManyToOne
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
    private persona persona;

    // Getters y Setters

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public turnoEmpleado getTurnoEmpleado() {
        return turnoEmpleado;
    }

    public void setTurnoEmpleado(turnoEmpleado turnoEmpleado) {
        this.turnoEmpleado = turnoEmpleado;
    }

    public persona getPersona() {
        return persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }
}
