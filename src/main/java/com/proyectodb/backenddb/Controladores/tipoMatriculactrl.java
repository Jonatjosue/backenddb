package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.marca;
import com.proyectodb.backenddb.Entidades.tipomatricula;
import com.proyectodb.backenddb.Repositorios.marcadal;
import com.proyectodb.backenddb.Repositorios.tipomatriculadal;

@RestController
public class tipoMatriculactrl {
    
    @Autowired
    private tipomatriculadal obj;

@GetMapping("/listatipoMatricula")
public List<tipomatricula> listar(){
    return (List<tipomatricula>) obj.findAll();
}

 @PostMapping(path="/insertartipoMatricula")
public String insertar(@RequestBody tipomatricula res) {
    obj.save(res);
return "Registro ingresado";
}

}
