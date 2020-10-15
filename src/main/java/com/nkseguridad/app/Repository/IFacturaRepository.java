package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Factura;

@Repository
public interface IFacturaRepository extends CrudRepository<Factura, String> {

}
