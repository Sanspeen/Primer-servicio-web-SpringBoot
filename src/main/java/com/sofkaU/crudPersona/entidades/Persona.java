package com.sofkaU.crudPersona.entidades;

import javax.persistence.*;

@Entity //Lo declara como entidad.
@Table(name="persona")//En caso tal de no existir la tabla persona, la creará.
public class Persona {

    @Id //Determina el tipo de la variable para que lo reconozca como ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Genera el valor en caso de no recibirlo
    @Column(unique = true, nullable = false)//Esto verifica que sea un valor unico e irrepetible y encima que no pueda ser nulo.
    private Integer id;
    private String nombre;
    private String edad;

    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
