package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.detalleFactura;

public interface detalleFacturadal extends JpaRepository<detalleFactura, Long> {
}
