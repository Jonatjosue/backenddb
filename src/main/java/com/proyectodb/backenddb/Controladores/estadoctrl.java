package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.estado;
import com.proyectodb.backenddb.Entidades.tipomatricula;
import com.proyectodb.backenddb.Repositorios.estadodal;
import com.proyectodb.backenddb.Repositorios.tipomatriculadal;

@RestController
public class estadoctrl {

     @Autowired
    private estadodal obj;

@GetMapping("/listaestado")
public List<estado> listar(){
    return (List<estado>) obj.findAll();
}

 @PostMapping(path="/insertarestado")
public String insertar(@RequestBody estado res) {
    obj.save(res);
return "Registro ingresado";
}
    
}
