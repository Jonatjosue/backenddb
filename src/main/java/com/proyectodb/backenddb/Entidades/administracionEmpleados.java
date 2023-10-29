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
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "administracionEmpleados")
public class administracionEmpleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPERSONA")
    private Long idPersona;

    @Column(name = "NOMBRES")
    private String nombres;

    @Column(name = "APELLIDOS")
    private String apellidos;

    @Column(name = "FECHANACIMIENTO")
    private Date fechaNacimiento;

    @Column(name = "NUMERO_TELEFONO")
    private Long numeroTelefono;

    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;

    @Column(name = "NIT")
    private String nit;

    @Column(name = "GENERO")
    private String genero;

    @Column(name = "CUI")
    private Long cui;

    @Column(name = "PUESTO")
    private String puesto;

    @Column(name = "FECHA_INICIO")
    private Date fechaInicio;

    @Column(name = "SALARIO_BASE")
    private Double salarioBase;

   

    // Getters y Setters

    // ...
}

