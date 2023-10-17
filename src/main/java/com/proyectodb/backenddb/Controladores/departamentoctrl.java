package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
public String InsertaProducto(@RequestBody String par_nombre, @RequestBody String par_depatamento) {
departamento objProducto = new departamento();
objProducto.setNOMBRE(par_nombre);
objProducto.setDEPARTAMENTO(par_depatamento);
dbobj.save(objProducto);
return "Registro ingresado";
}
    
}
