package com.example.demo.Services;

import com.example.demo.Entities.Persona;
import com.example.demo.Repository.PersonaRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService {

    @Autowired
    private PersonaRepo repositorio;

    @Override
    public Persona insertarDispositivo(Persona persona) {
       return repositorio.save(persona);
    }

    @Override
    public List<Persona> listarDispositivos() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Persona> listarComunidadID(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Persona editarComunidad(Persona persona) {
        return repositorio.save(persona);
    }

    @Override
    public Optional<Persona> eliminarComunidad(int id) {
        Optional<Persona> persona = repositorio.findById(id);
        if(persona!=null){//comprobamos si el objeto existe
            repositorio.deleteById(id);
        }
        return persona;
    }

}
