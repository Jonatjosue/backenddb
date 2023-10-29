package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.administracionEmpleados;
import com.proyectodb.backenddb.Repositorios.administracionEmpleadosdal;

@RestController
public class administracionEmpleadosctrl {
    @Autowired
    private administracionEmpleadosdal adminempleadosrepository;

    @GetMapping("/administracionEmpleados")
    public List<administracionEmpleados> listar(){
        return adminempleadosrepository.findAll() ;
    }
    
}
