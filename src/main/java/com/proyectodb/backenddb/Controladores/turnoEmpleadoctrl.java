package com.proyectodb.backenddb.Controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.tipomatricula;
import com.proyectodb.backenddb.Entidades.turnoEmpleado;
import com.proyectodb.backenddb.Repositorios.tipomatriculadal;
import com.proyectodb.backenddb.Repositorios.turnoEmpleadodal;


@RestController
public class turnoEmpleadoctrl {
    
     @Autowired
    private turnoEmpleadodal obj;

@GetMapping("/listaturnoempleado")
public List<turnoEmpleado> listar(){
    return (List<turnoEmpleado>) obj.findAll();
}

 @PostMapping(path="/insertarturnoempleado")
public String insertar(@RequestBody turnoEmpleado res) {
    obj.save(res);
return "Registro ingresado";
}

}
