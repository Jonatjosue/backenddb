package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.docIdentificacion;
import com.proyectodb.backenddb.Entidades.persona;
import com.proyectodb.backenddb.Repositorios.clientedal;
import com.proyectodb.backenddb.Repositorios.docIdentificaciondal;
import com.proyectodb.backenddb.Repositorios.empleadodal;
import com.proyectodb.backenddb.Repositorios.personadal;
import com.proyectodb.backenddb.Repositorios.proveedordal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class personactrl {

    @Autowired
    private personadal personarepository;

    @Autowired
    private docIdentificaciondal docrepository;


    @GetMapping("/listarpersona")
    public List<persona> listar() {
        return  personarepository.findAll();
    }
    
    @PostMapping("/insertarpersona")
    public String insertar(@RequestBody persona per){
        docIdentificacion doc = per.getDocIdentificacion();

        personarepository.save(per);
        docrepository.save(doc);
        return "persona ingresada";
    }



    
}
