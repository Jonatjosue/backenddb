package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.estado;
import com.proyectodb.backenddb.Entidades.oferta;
import com.proyectodb.backenddb.Entidades.producto;
import com.proyectodb.backenddb.Repositorios.estadodal;
import com.proyectodb.backenddb.Repositorios.ofertadal;
import com.proyectodb.backenddb.Repositorios.productodal;

@RestController
public class productoctrl {

    @Autowired
    private productodal prorepository;
    
    @Autowired
    private ofertadal oferrepository;

    @Autowired
    private estadodal estadorespository;
    
    @GetMapping("/listarproducto")
    public List<producto> listar(){
        return prorepository.findAll();
    }
    
    @PostMapping
    public String insertar(@RequestBody producto pro){

        oferta of = pro.getOferta();
        estado es = pro.getEstado();

        prorepository.save(pro);
        oferrepository.save(of);
        estadorespository.save(es);

        return "ingresado";
    }


}
