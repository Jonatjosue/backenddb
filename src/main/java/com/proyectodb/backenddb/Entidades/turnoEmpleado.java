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
import java.util.Date;

@Entity
@Table(name = "TURNO_EMPLEADO")
public class turnoEmpleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(name = "IDTURNO")
    private Long idTurno;

    @Column(name = "FECHA_TURNO")
    private Date fechaTurno;

    @Column(name = "HORA_INICIO")
    private String horaInicio;

    @Column(name = "HORA_FIN")
    private String horaFin;

    // Getters y Setters

    public Long getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Long idTurno) {
        this.idTurno = idTurno;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
}

