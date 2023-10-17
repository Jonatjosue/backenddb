package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.sucursal;

public interface sucuraldal extends JpaRepository<sucursal, Integer> {
    // Puedes agregar métodos de consulta personalizados si los necesitas
}

