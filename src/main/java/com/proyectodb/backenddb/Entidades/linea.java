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

import java.util.List;

import com.proyectodb.backenddb.Entidades.marca;

@Entity
@Table(name = "LINEA")
public class linea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
    @Column(name = "IDLINEA")
    private Long idlinea;

    @Column(name = "LINEA")
    private String linea;

    @ManyToOne
    @JoinColumn(name = "IDMARCA", referencedColumnName = "IDMARCA")
    private marca marca;

    // Getters y Setters

    public Long getIdlinea() {
        return idlinea;
    }

    public void setIdlinea(Long idlinea) {
        this.idlinea = idlinea;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public marca getMarca() {
        return marca;
    }

    public void setMarca(marca marca) {
        this.marca = marca;
    }

    public List<linea> findAll() {
        return null;
    }
}
