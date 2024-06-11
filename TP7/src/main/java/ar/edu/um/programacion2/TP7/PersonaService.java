package ar.edu.um.programacion2.TP7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;

    public Collection<Persona> findAll() {
        return repository.findAll();
    }

    public Persona findById(Long id) {
        return repository.findById(id);
    }

    public Persona save(Persona persona) {
        return repository.save(persona);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Persona update(Persona personaUpdate, Long id){
        repository.update(personaUpdate,id);
        return personaUpdate;
    }
}
