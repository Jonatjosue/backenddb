package com.proyectodb.backenddb.Entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TIPOMATRICULA")
public class tipomatricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic (optional = false)
    @Column(name = "IDTIPOMATRICULA")
    private Long idtipomatricula;

    @Column(name = "PREFIJOMATRICULA")
    private String prefijomatricula;

    @Column(name = "TIPOMATRICULA")
    private String tipomatricula;

    // Getters y Setters

    public Long getIdtipomatricula() {
        return idtipomatricula;
    }

    public void setIdtipomatricula(Long idtipomatricula) {
        this.idtipomatricula = idtipomatricula;
    }

    public String getPrefijomatricula() {
        return prefijomatricula;
    }

    public void setPrefijomatricula(String prefijomatricula) {
        this.prefijomatricula = prefijomatricula;
    }

    public String getTipomatricula() {
        return tipomatricula;
    }

    public void setTipomatricula(String tipomatricula) {
        this.tipomatricula = tipomatricula;
    }
}

