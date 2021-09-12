package com.sofkaU.crudPersona.controlador;

import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.servicios.InterfasSerivciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;

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
    public Persona actualizarPersonas(@RequestBody Persona persona){
        return servicio.actualizar(persona);
    }

}
