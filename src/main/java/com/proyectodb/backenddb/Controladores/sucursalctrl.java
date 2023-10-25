package com.proyectodb.backenddb.Controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.departamento;
import com.proyectodb.backenddb.Entidades.sucursal;
import com.proyectodb.backenddb.Repositorios.departamentodal;
import com.proyectodb.backenddb.Repositorios.sucuraldal;

@RestController
public class sucursalctrl {

    @Autowired
    private sucuraldal sucursalRepository;

   
    @Autowired
    private departamentodal depdal;
    
    @GetMapping ("/Listasucursal")
    public List<sucursal> obtenerTodasLasSucursales() {
        return sucursalRepository.findAll();
    }
 
    @PostMapping("/addsucursal")
    public String insertar(@RequestBody sucursal rep){
        departamento deps = rep.getLocalidad();

        sucursalRepository.save(rep);
        depdal.save(deps);

        return "ingresado sucursal";
    }




    
}

