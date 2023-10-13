package com.proyectodb.backenddb.Entidades;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity  
@Component
@Table(name="departamento")

public class departamento {
    @Id

    @GenericGenerator(name = "DEPARTAMENTO", strategy = "enhanced-table", parameters = {
        @org.hibernate.annotations.Parameter(name = "DEPARTAMENTO", value = "sequence_table")
    })
    @GeneratedValue(generator = "secuence_table", strategy=GenerationType.TABLE)

    private Integer IDLOCALIDAD;
    private String NOMBRE;
    private String DEPARTAMENTO;
    public Integer getIDLOCALIDAD() {
        return IDLOCALIDAD;
    }
    public void setIDLOCALIDAD(Integer Idlocalidad) {
        IDLOCALIDAD = Idlocalidad;
    }
    public String getNOMBRE() {
        return NOMBRE;
    }
    public void setNOMBRE(String nombre) {
        NOMBRE = nombre;
    }
    public String getDEPARTAMENTO() {
        return DEPARTAMENTO;
    }
    public void setDEPARTAMENTO(String departamento) {
        DEPARTAMENTO = departamento;
    }
    
}
