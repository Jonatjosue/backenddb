package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.proveedor;

public interface proveedordal extends JpaRepository<proveedor, Long> {
}

