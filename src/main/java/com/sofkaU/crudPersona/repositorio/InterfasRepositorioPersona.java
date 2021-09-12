package com.sofkaU.crudPersona.repositorio;

import com.sofkaU.crudPersona.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//El repositorio solicita a CrudRepository y verifica el dato desde Entidades.


@Repository
public interface InterfasRepositorioPersona extends CrudRepository <Persona, Integer> {
}
