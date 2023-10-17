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
@Table(name = "ESTADO")
public class estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(name = "IDESTADO")
    private Long idestado;

    @Column(name = "VENCIDO")
    private Long vencido;

    @Column(name = "DANYADO")
    private Long danyado;

    @Column(name = "DESCONTINUADO")
    private Long descontinuado;

    // Getters y Setters

    public Long getIdestado() {
        return idestado;
    }

    public void setIdestado(Long idestado) {
        this.idestado = idestado;
    }

    public Long getVencido() {
        return vencido;
    }

    public void setVencido(Long vencido) {
        this.vencido = vencido;
    }

    public Long getDanyado() {
        return danyado;
    }

    public void setDanyado(Long danyado) {
        this.danyado = danyado;
    }

    public Long getDescontinuado() {
        return descontinuado;
    }

    public void setDescontinuado(Long descontinuado) {
        this.descontinuado = descontinuado;
    }
}

