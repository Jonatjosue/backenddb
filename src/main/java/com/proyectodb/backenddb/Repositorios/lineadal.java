package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.linea;

public interface lineadal extends JpaRepository<linea, Long> {
}

