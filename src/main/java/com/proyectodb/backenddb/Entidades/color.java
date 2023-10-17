package com.proyectodb.backenddb.Entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COLOR")
public class color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(name = "IDCOLOR")
    private Long idcolor;

    @Column(name = "COLOR")
    private String color;

    // Getters y Setters

    public Long getIdcolor() {
        return idcolor;
    }

    public void setIdcolor(Long idcolor) {
        this.idcolor = idcolor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

