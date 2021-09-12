package com.sofkaU.crudPersona.repositorio;

import com.sofkaU.crudPersona.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InterfasRepositorioPersona extends CrudRepository <Persona, Integer> {
}
