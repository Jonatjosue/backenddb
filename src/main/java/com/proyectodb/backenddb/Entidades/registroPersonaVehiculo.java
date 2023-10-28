package com.proyectodb.backenddb.Entidades;

import java.util.Date;

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
@Table(name = "REGISTRO_PERSONA_VEHICULO")
public class registroPersonaVehiculo {
    @Id
    @ManyToOne
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
    private persona persona;

    @Id
    @ManyToOne
    @JoinColumn(name = "IDVEHICULO", referencedColumnName = "IDVEHICULO")
    private vehiculo vehiculo;

    @Column(name = "FECHA_REGISTRO")
    private Date fechaRegistro;

    // Getters y Setters

    public persona getPersona() {
        return persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }

    public vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

