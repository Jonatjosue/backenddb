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
@Table(name = "DOC_IDENTIFICACION")
public class docIdentificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(name = "ID_IDENTIFICACION")
    private Long idIdentificacion;

    @Column(name = "DPI")
    private Long dpi;

    @Column(name = "CARNET")
    private String carnet;

    @Column(name = "PASAPORTE")
    private String pasaporte;

    @Column(name = "TIPOMATRICULA")
    private String tipoMatricula;

    // Getters y Setters

    public Long getIdIdentificacion() {
        return idIdentificacion;
    }

    public void setIdIdentificacion(Long idIdentificacion) {
        this.idIdentificacion = idIdentificacion;
    }

    public Long getDpi() {
        return dpi;
    }

    public void setDpi(Long dpi) {
        this.dpi = dpi;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getTipoMatricula() {
        return tipoMatricula;
    }

    public void setTipoMatricula(String tipoMatricula) {
        this.tipoMatricula = tipoMatricula;
    }
}
