package com.sofkaU.crudPersona.controlador;

import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.servicios.InterfasSerivciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("API")
public class ControladorPersona {

    @Autowired
    private InterfasSerivciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona> ListarPersonas(){
        return servicio.listar();
    }

    @PostMapping(value = "/guardarPersonas")
    public Persona guardarPersonas(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }

    @PostMapping("/actualizarPersonas")
    public Persona actualizarPersonas(@RequestBody Persona persona){return servicio.actualizar(persona);}

    @GetMapping(path = "/{id}")
    public Optional<Persona> listarPersonasPorID(@PathVariable("id") int id){
        return servicio.listarID(id);
    }

    @DeleteMapping(path = "/{id}")
    public void eliminarPorID(@PathVariable("id") int id){
        servicio.borrar(id);
    }
}
