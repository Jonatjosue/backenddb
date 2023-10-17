package com.proyectodb.backenddb.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


import com.proyectodb.backenddb.Entidades.linea;
import com.proyectodb.backenddb.Entidades.tipomatricula;
import com.proyectodb.backenddb.Entidades.color;

@Entity
@Table(name = "VEHICULO")
public class vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVEHICULO")
    private Long idvehiculo;

    @Column(name = "MATRICULA")
    private String matricula;

    @ManyToOne
    @JoinColumn(name = "IDTIPOMATRICULA", referencedColumnName = "IDTIPOMATRICULA")
    private tipomatricula tipomatricula;

    @Column(name = "ANIO")
    private Integer anio;

    @ManyToOne
    @JoinColumn(name = "IDLINEA", referencedColumnName = "IDLINEA")
    private linea linea;

    @ManyToOne
    @JoinColumn(name = "IDCOLOR", referencedColumnName = "IDCOLOR")
    private color color;

    // Getters y Setters

    public Long getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(Long idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public tipomatricula getTipomatricula() {
        return tipomatricula;
    }

    public void setTipomatricula(tipomatricula tipomatricula) {
        this.tipomatricula = tipomatricula;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public linea getLinea() {
        return linea;
    }

    public void setLinea(linea linea) {
        this.linea = linea;
    }

    public color getColor() {
        return color;
    }

    public void setColor(color color) {
        this.color = color;
    }
}
