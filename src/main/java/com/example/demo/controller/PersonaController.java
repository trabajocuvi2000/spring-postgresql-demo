
package com.example.demo.controller;

import com.example.demo.Entities.Persona;
import com.example.demo.Services.PersonaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping({"persona"})
public class PersonaController {
    
    @Autowired
    private PersonaService service;

    @PostMapping
    public Persona guardarDispositivo(@RequestBody Persona dispositivo) {
        return service.insertarDispositivo(dispositivo);
    }

    @GetMapping
    public List<Persona> listar() {
        return service.listarDispositivos();
    }
    
    @GetMapping(path = {"/{id}"})
    public Optional<Persona> listarUsuarioId(@PathVariable("id") int id) {
        return service.listarComunidadID(id);
    }
    
    @PutMapping(path = {"/{id}"})
    public Persona editarUsuarioIfon(@RequestBody Persona dis, @PathVariable("id") int id) {
        dis.setId(id);
        return service.editarComunidad(dis);
    }
    
    @DeleteMapping(path = {"/{id}"})
    public Optional<Persona> eliminarEstandar(@PathVariable("id") int id) {
        return service.eliminarComunidad(id);
    }
    
    
}
