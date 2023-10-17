package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.productoProveedor;

public interface productoProveedordal extends JpaRepository<productoProveedor, Long> {

}

