package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.empleado;
import com.proyectodb.backenddb.Entidades.persona;
import com.proyectodb.backenddb.Entidades.turnoEmpleado;
import com.proyectodb.backenddb.Repositorios.empleadodal;
import com.proyectodb.backenddb.Repositorios.personadal;
import com.proyectodb.backenddb.Repositorios.turnoEmpleadodal;

@RestController
public class empleadoctrl {
    @Autowired
    private empleadodal empleadorepository;

    @Autowired
    private turnoEmpleadodal turnorepository;

    @Autowired
    private personadal personarepository;

    @GetMapping("/listaremplado")
    public List<empleado> listar(){
        return empleadorepository.findAll();
    }

    @PostMapping("/insertarempleado")
    public String insertar(@RequestBody empleado emp){
        turnoEmpleado turno = emp.getTurnoEmpleado();
        persona pers = emp.getPersona();

        empleadorepository.save(emp);
        turnorepository.save(turno);
        personarepository.save(pers);
        return "empleado ingresado";
    }

    
}
