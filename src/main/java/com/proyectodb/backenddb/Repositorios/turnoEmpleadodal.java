package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.turnoEmpleado;

public interface turnoEmpleadodal extends JpaRepository<turnoEmpleado, Long> {
}

