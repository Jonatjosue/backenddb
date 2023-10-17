package com.proyectodb.backenddb.Controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.tipoPago;
import com.proyectodb.backenddb.Entidades.tipomatricula;
import com.proyectodb.backenddb.Repositorios.tipoPagodal;
import com.proyectodb.backenddb.Repositorios.tipomatriculadal;

@RestController
public class tipoPagoctrl {
    
     @Autowired
    private tipoPagodal obj;

@GetMapping("/listatipopago")
public List<tipoPago> listar(){
    return (List<tipoPago>) obj.findAll();
}

 @PostMapping(path="/insertartipopago")
public String insertar(@RequestBody tipoPago res) {
    obj.save(res);
return "Registro ingresado";
}


}
