package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.vehiculo;

public interface vehiculodal extends JpaRepository<vehiculo, Long> {
}

