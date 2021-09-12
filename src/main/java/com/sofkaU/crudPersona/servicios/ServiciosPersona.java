package com.sofkaU.crudPersona.servicios;

import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.repositorio.InterfasRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
//Los servicios solicitan a el repositorio.


@Service
public class ServiciosPersona implements InterfasSerivciosPersona {

    @Autowired
    private InterfasRepositorioPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarID(int id) {
        return data.findById(id);
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(int id) {
        data.deleteById(id);
    }

    @Override
    public Persona actualizar(Persona persona) {
        return data.save(persona);
    }
}
