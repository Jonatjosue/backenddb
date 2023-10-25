package com.proyectodb.backenddb.Controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.factura;
import com.proyectodb.backenddb.Repositorios.facturadal;


@RestController
public class facturactrl {

     @Autowired
    private facturadal obj;

      
@GetMapping("/listafactura")
public List<factura> listar(){
    return (List<factura>) obj.findAll();
}

 @PostMapping(path="/insertarfactura")
public String insertar(@RequestBody factura res) {
    obj.save(res);
return "Registro ingresado";
}
    
}
