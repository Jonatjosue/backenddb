package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Repositorios.regpervehiculodal;
import com.proyectodb.backenddb.Entidades.registroPersonaVehiculo;

@RestController
public class registroPersonaVehiculoctrl {

    @Autowired
    private regpervehiculodal registropersonavehiculoRepository;

    @GetMapping("/listarregistroveh")
    public List<registroPersonaVehiculo> listar(){
        return registropersonavehiculoRepository.findAll();
    }

    @PostMapping("/insertarregistrovehi")
    public String insertar(@RequestBody registroPersonaVehiculo reg){

        registropersonavehiculoRepository.save(reg);
        return "ingresado";
    }


}
