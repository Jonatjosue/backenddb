package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.docIdentificacion;

public interface docIdentificaciondal extends JpaRepository<docIdentificacion, Long> {
}
