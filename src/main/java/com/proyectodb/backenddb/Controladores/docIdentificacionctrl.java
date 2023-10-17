package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.docIdentificacion;
import com.proyectodb.backenddb.Entidades.tipomatricula;
import com.proyectodb.backenddb.Repositorios.docIdentificaciondal;
import com.proyectodb.backenddb.Repositorios.tipomatriculadal;

@RestController
public class docIdentificacionctrl {
    
     @Autowired
    private docIdentificaciondal obj;

@GetMapping("/listadocIdentificacion")
public List<docIdentificacion> listar(){
    return (List<docIdentificacion>) obj.findAll();
}

 @PostMapping(path="/insertardocIdentificacion")
public String insertar(@RequestBody docIdentificacion res) {
    obj.save(res);
return "Registro ingresado";
}

}
