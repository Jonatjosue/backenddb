package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.departamento;
import com.proyectodb.backenddb.Repositorios.departamentodal;

@RestController
public class departamentoctrl {

 @Autowired
    private departamentodal dbobj;

    
@GetMapping ("/Listadepartamento")
public List<departamento> Listadepartamento() {
return (List<departamento>) dbobj.findAll();
}

    @PostMapping(path="/Insertadepartamento")
public String InsertaProducto(@RequestBody departamento dep) {
    dbobj.save(dep);
return "Registro ingresado";
}


    
}
