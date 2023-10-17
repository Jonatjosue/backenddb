package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.detalleFactura;
import com.proyectodb.backenddb.Entidades.tipomatricula;
import com.proyectodb.backenddb.Repositorios.detalleFacturadal;
import com.proyectodb.backenddb.Repositorios.tipomatriculadal;

@RestController
public class detalleFacturactrl {
    
 @Autowired
    private detalleFacturadal obj;

@GetMapping("/listadetallefactura")
public List<detalleFactura> listar(){
    return (List<detalleFactura>) obj.findAll();
}

 @PostMapping(path="/insertardetallefactura")
public String insertar(@RequestBody detalleFactura res) {
    obj.save(res);
return "Registro ingresado";
}

}
