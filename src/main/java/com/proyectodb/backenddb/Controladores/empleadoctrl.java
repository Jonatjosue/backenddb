package com.proyectodb.backenddb.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.docIdentificacion;
import com.proyectodb.backenddb.Entidades.empleado;
import com.proyectodb.backenddb.Entidades.persona;
import com.proyectodb.backenddb.Entidades.turnoEmpleado;
import com.proyectodb.backenddb.Repositorios.docIdentificaciondal;
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


    @Autowired
    private docIdentificaciondal docdal;

    @GetMapping("/listaremplado")
    public List<empleado> listar(){
        return empleadorepository.findAll();
    }

    @GetMapping("/listarempladodashboard")
    public List<empleado> listarempleado(){
        return empleadorepository.empleadodash();
    }


    @PostMapping("/insertarempleado")
    public String insertar(@RequestBody empleado emp){
        turnoEmpleado turno = emp.getTurnoEmpleado();
        persona pers = emp.getPersona();
        docIdentificacion doc = pers.getDocIdentificacion();
       
        turnorepository.save(turno);
        empleadorepository.save(emp);
        docdal.save(doc);
        personarepository.save(pers);
        return "empleado ingresado";
    }

    @DeleteMapping(path = "/despedirEmpleado/{IDEMPLEADO}")
	public String despedirEmpleado(@PathVariable("IDEMPLEADO") Long IDEMPLEADO) {
		Optional<empleado> despedido = empleadorepository.findById(IDEMPLEADO);

		if (despedido.isPresent()) {

			empleadorepository.delete(despedido.get());

		}
        return "borrado";
	}


}
