package com.proyectodb.backenddb.Controladores;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.cliente;
import com.proyectodb.backenddb.Entidades.color;
import com.proyectodb.backenddb.Entidades.historialCompra;
import com.proyectodb.backenddb.Entidades.persona;
import com.proyectodb.backenddb.Repositorios.clientedal;
import com.proyectodb.backenddb.Repositorios.historialCompradal;
import com.proyectodb.backenddb.Repositorios.personadal;

@RestController
public class clientesctrl {
    
    @Autowired 
    private clientedal clidal;

    @Autowired 
    private historialCompradal hisdal;

    @Autowired
    private personadal perdal;


    @GetMapping("/listacliente")
    public  List<cliente> listar(){
        return  clidal.findAll();
    }

    @PostMapping("/insertarcliente")
    public String insertar(@RequestBody cliente cli){


        historialCompra his = cli.getHistorialCompra();
        persona per = cli.getPersona();

        clidal.save(cli);
        hisdal.save(his);
        perdal.save(per);

        return "ingresado";
    }




}
