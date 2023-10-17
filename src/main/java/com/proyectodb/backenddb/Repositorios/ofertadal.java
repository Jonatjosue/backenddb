package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectodb.backenddb.Entidades.oferta;

public interface ofertadal extends JpaRepository<oferta, Long> {
}
