package com.sofkaU.crudPersona.controlador;

import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.servicios.InterfasSerivciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
//El controlador solicita a los servicios.


@RestController
@RequestMapping("API")
public class ControladorPersona {

    @Autowired
    private InterfasSerivciosPersona servicio;

    //Obtener todos
    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona> ListarPersonas(){
        try {
            return servicio.listar();

        }catch (Error e){
            return (Iterable<Persona>) e;
        }
    }

    //Crear
    @PostMapping(value = "/guardarPersonas")
    public Persona guardarPersonas(@RequestBody Persona persona){
            return servicio.guardar(persona);
    }

    //Actualizar por ID
    @PostMapping("/actualizarPersonas")
    public Persona actualizarPersonas(@RequestBody Persona persona){
        return servicio.actualizar(persona);
    }

    //Obtener por ID
    @GetMapping(path = "/{id}")
    public Optional<Persona> listarPersonasPorID(@PathVariable("id") int id){
        return servicio.listarID(id);
    }

    //Eliminar por ID
    @DeleteMapping(path = "/{id}")
    public void eliminarPorID(@PathVariable("id") int id){
        servicio.borrar(id);
    }
}
