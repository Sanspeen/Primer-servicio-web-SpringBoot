package com.sofkaU.crudPersona.servicios;

import com.sofkaU.crudPersona.entidades.Persona;

import java.util.List;

public interface InterfasSerivciosPersona {

    public List<Persona> listar();
    public Persona listarID(int id );
    public Persona guardar(Persona persona);
    public void borrar(int id);
    public Persona actualizar(Persona persona);
}
