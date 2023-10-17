package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.departamento;
import com.proyectodb.backenddb.Entidades.marca;
import com.proyectodb.backenddb.Repositorios.marcadal;

@RestController
public class marcactrl {
    
    @Autowired
    private marcadal marcaobj;

@GetMapping("/listamarca")
public List<marca> listamarca(){
    return (List<marca>) marcaobj.findAll();
}

 @PostMapping(path="/insertarmarca")
public String insertarmarca(@RequestBody marca mar) {
    marcaobj.save(mar);
return "Registro ingresado";
}


}
