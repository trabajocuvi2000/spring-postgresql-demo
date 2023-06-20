
package com.example.demo.Services;

import com.example.demo.Entities.Persona;
import java.util.List;
import java.util.Optional;

public interface PersonaService {
    
    Persona insertarDispositivo(Persona persona);

    List<Persona> listarDispositivos();
    
    
    Optional<Persona> listarComunidadID(int id);

    Persona editarComunidad(Persona persona);

    Optional<Persona> eliminarComunidad(int id);

    
}
