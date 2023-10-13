package com.proyectodb.backenddb.Repositorios;

import org.springframework.data.repository.CrudRepository;

import com.proyectodb.backenddb.Entidades.departamento;


public interface  departamentodal extends CrudRepository<departamento,Integer> {
    
}
