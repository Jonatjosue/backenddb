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
@Table(name = "TIPO_PAGO")
public class tipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(name = "IDTIPOPAGO")
    private Long idtipoPago;

    @Column(name = "NUMERO_PAGO")
    private String numeroPago;

    @Column(name = "T_DEBITO")
    private Long tDebito;

    @Column(name = "T_CREDITO")
    private Long tCredito;

    @Column(name = "EFECTIVO")
    private Long efectivo;

    // Getters y Setters

    public Long getIdtipoPago() {
        return idtipoPago;
    }

    public void setIdtipoPago(Long idtipoPago) {
        this.idtipoPago = idtipoPago;
    }

    public String getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(String numeroPago) {
        this.numeroPago = numeroPago;
    }

    public Long gettDebito() {
        return tDebito;
    }

    public void settDebito(Long tDebito) {
        this.tDebito = tDebito;
    }

    public Long gettCredito() {
        return tCredito;
    }

    public void settCredito(Long tCredito) {
        this.tCredito = tCredito;
    }

    public Long getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Long efectivo) {
        this.efectivo = efectivo;
    }
}

