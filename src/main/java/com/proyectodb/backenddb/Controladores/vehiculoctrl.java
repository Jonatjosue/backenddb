package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.color;
import com.proyectodb.backenddb.Entidades.linea;
import com.proyectodb.backenddb.Entidades.tipomatricula;
import com.proyectodb.backenddb.Entidades.vehiculo;
import com.proyectodb.backenddb.Repositorios.colordal;
import com.proyectodb.backenddb.Repositorios.lineadal;
import com.proyectodb.backenddb.Repositorios.tipomatriculadal;
import com.proyectodb.backenddb.Repositorios.vehiculodal;

@RestController
public class vehiculoctrl {
    @Autowired
    private vehiculodal vehiculorepository;

    @Autowired
    private tipomatriculadal tiporepository;

    @Autowired 
    private colordal colorepository;

    @Autowired
    private lineadal linearepository;

    @GetMapping("/listarvehiculo")
    public List<vehiculo> listar(){
        return vehiculorepository.findAll();
    } 

    @PostMapping("/insertarvehiculo")
    public String insertar(@RequestBody vehiculo vehi){
        tipomatricula tip = vehi.getTipomatricula();
        color col = vehi.getColor();
        linea lin = vehi.getLinea();

        vehiculorepository.save(vehi);
        tiporepository.save(tip);
        colorepository.save(col);
        linearepository.save(lin);

        return "vehiculo ingresado";
    }

}
