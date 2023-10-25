package com.proyectodb.backenddb.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectodb.backenddb.Entidades.factura;
import com.proyectodb.backenddb.Entidades.historialCompra;
import com.proyectodb.backenddb.Repositorios.facturadal;
import com.proyectodb.backenddb.Repositorios.historialCompradal;

@RestController
public class historialCompractrl {
    @Autowired
    private historialCompradal historyrepository;

    @Autowired
    private facturadal facturarepository;

    @GetMapping("/listarhisorial")
    public List<historialCompra> listar(){
        return historyrepository.findAll();
    }

    @PostMapping("insertarhistorial")
    public String insertar(@RequestBody historialCompra his){
        factura fac= his.getFactura();

        historyrepository.save(his);
        facturarepository.save(fac);

        return "ingresado historial";
    }



}
