package com.proyectodb.backenddb.Controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.persona;
import com.proyectodb.backenddb.Entidades.productoProveedor;
import com.proyectodb.backenddb.Entidades.proveedor;
import com.proyectodb.backenddb.Repositorios.personadal;
import com.proyectodb.backenddb.Repositorios.productoProveedordal;
import com.proyectodb.backenddb.Repositorios.proveedordal;

@RestController
public class proveedorctrl {
    @Autowired
    private proveedordal proveedorepository;

    @Autowired 
    private productoProveedordal productoproveedorepository;

    @Autowired
    private personadal personarepository;


    @GetMapping("/listarproveedor")
    public List<proveedor> listar(){
        return proveedorepository.findAll();
    }

    @PostMapping("/insertarproveedor")
    public String insertar(@RequestBody proveedor prov){
        productoProveedor proprop = prov.getProductoProveedor();
        persona per = prov.getPersona();

        proveedorepository.save(prov);
        productoproveedorepository.save(proprop);
        personarepository.save(per);
        
        return "ingresado";
    }

}
