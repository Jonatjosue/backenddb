package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.registroPersonaVehiculo;

public interface regpervehiculodal extends JpaRepository<registroPersonaVehiculo, Long> {
}
