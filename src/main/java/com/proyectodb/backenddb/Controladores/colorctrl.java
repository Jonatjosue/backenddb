package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.color;
import com.proyectodb.backenddb.Entidades.tipomatricula;
import com.proyectodb.backenddb.Repositorios.colordal;
import com.proyectodb.backenddb.Repositorios.tipomatriculadal;

@RestController
public class colorctrl {
    
     @Autowired
    private colordal obj;

@GetMapping("/listacolor")
public List<color> listar(){
    return (List<color>) obj.findAll();
}

 @PostMapping(path="/insertarcolor")
public String insertar(@RequestBody color res) {
    obj.save(res);
return "Registro ingresado";
}


}
