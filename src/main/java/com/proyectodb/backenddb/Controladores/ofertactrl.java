package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.oferta;
import com.proyectodb.backenddb.Entidades.tipomatricula;
import com.proyectodb.backenddb.Repositorios.ofertadal;
import com.proyectodb.backenddb.Repositorios.tipomatriculadal;

@RestController
public class ofertactrl {

     @Autowired
    private ofertadal obj;

@GetMapping("/listaOferta")
public List<oferta> listar(){
    return (List<oferta>) obj.findAll();
}

 @PostMapping(path="/insertaroferta")
public String insertar(@RequestBody oferta res) {
    obj.save(res);
return "Registro ingresado";
}
    
}
