package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.factura;

public interface facturadal extends JpaRepository<factura, Long> {
    
}

