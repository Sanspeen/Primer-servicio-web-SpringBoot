package com.sofkaU.crudPersona.controlador;

import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.servicios.InterfasSerivciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    private InterfasSerivciosPersona servicio;

    @GetMapping(value = "/ListarPersonas")
    public Iterable<Persona> ListarPersonas(){
        return servicio.listar();
    }

    @PostMapping(value = "/guardarPersonas")
    public Persona guardarPersonas(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }


}
