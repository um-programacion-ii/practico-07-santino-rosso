package ar.edu.um.programacion2.TP7;

import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonaRepository {
    private Map<Long, Persona> database = new HashMap<>();
    private Long currentId = 1L;

    public Collection<Persona> findAll() {
        return database.values();
    }

    public Persona findById(Long id) {
        return database.get(id);
    }

    public Persona save(Persona persona) {
        if (persona.getId() == null) {
            persona.setId(currentId++);
        }
        database.put(persona.getId(), persona);
        return persona;
    }

    public void deleteById(Long id) {
        database.remove(id);
    }

    public void update(Persona personaUpdate,Long id){
        deleteById(id);
        personaUpdate.setId(id);
        save(personaUpdate);
    }
}
