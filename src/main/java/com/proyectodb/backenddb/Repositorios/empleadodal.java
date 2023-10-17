package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.empleado;

public interface empleadodal extends JpaRepository<empleado, Long> {
}
