package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.GrupoArticulo;



@Repository
public interface IGrupoArticuloRepository extends CrudRepository<GrupoArticulo, String>{

}
