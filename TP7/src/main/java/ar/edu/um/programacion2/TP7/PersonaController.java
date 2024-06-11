package ar.edu.um.programacion2.TP7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService service;

    @GetMapping("/")
    public Collection<Persona> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Persona findOne(@PathVariable Long id) {
        Persona persona = service.findById(id);
        return persona;
    }

    @PostMapping("/")
    public Persona add(@RequestBody Persona entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public Persona update(@RequestBody Persona persona, @PathVariable Long id) {
        return service.update(persona,id);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable Long id) {
        service.deleteById(id);
    }
}
