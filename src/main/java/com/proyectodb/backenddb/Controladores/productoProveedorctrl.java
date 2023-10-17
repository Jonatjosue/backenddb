package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.productoProveedor;
import com.proyectodb.backenddb.Entidades.tipomatricula;
import com.proyectodb.backenddb.Repositorios.productoProveedordal;
import com.proyectodb.backenddb.Repositorios.tipomatriculadal;

@RestController
public class productoProveedorctrl {
   
     @Autowired
    private productoProveedordal obj;

@GetMapping("/listaproductoProveedor")
public List<productoProveedor> listar(){
    return (List<productoProveedor>) obj.findAll();
}

 @PostMapping(path="/insertarproductoProveedor")
public String insertar(@RequestBody productoProveedor res) {
    obj.save(res);
return "Registro ingresado";
}

}
