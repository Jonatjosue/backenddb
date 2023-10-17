package com.proyectodb.backenddb.Controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.proyectodb.backenddb.Entidades.sucursal;
import com.proyectodb.backenddb.Repositorios.sucuraldal;

@RestController
public class sucursalctrl {

    @Autowired
    private sucuraldal sucursalRepository;

   
    // Obtener todas las sucursales
    @GetMapping ("/Listasucursal")
    public List<sucursal> obtenerTodasLasSucursales() {
        return sucursalRepository.findAll();
    }
/* 
    @PostMapping("/addsucursal")
    public */

    
}

