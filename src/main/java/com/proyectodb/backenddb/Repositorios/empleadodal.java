package com.proyectodb.backenddb.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyectodb.backenddb.Entidades.empleado;

public interface empleadodal extends JpaRepository<empleado, Long> {
 


@Query("SELECT e FROM empleado e JOIN e.persona p")
List<empleado> empleadodash();

}
