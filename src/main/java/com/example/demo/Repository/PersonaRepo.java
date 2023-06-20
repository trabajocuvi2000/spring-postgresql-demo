
package com.example.demo.Repository;

import com.example.demo.Entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepo extends JpaRepository<Persona, Integer> {
    
}
