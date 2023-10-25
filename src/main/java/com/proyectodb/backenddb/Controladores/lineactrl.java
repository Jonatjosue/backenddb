package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.linea;
import com.proyectodb.backenddb.Entidades.marca;
import com.proyectodb.backenddb.Repositorios.lineadal;
import com.proyectodb.backenddb.Repositorios.marcadal;

@RestController
public class lineactrl {
    
    @Autowired
    private lineadal lirep;

    @Autowired
    private marcadal marrep;

    @GetMapping("/listarlinea")
    public List<linea> listar(){
        return lirep.findAll();
    }


    @PostMapping("/insertarlinea")
    public String insertar(@RequestBody linea lin){
        marca mr = lin.getMarca();

        lirep.save(lin);
        marrep.save(mr);
        return "linea insertada";
    }

}
