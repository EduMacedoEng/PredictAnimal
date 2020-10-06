package github.EduMacedoEng.PredictAnimal.Model.Rest;

import github.EduMacedoEng.PredictAnimal.Model.Entity.Animal;
import github.EduMacedoEng.PredictAnimal.Model.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/animais")
@CrossOrigin("*")
public class AnimalController {
    private final AnimalRepository repository;

    @Autowired
    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Animal save(@RequestBody @Valid Animal animal){
        return repository.save(animal);
    }

    @GetMapping("{id}")
    public Animal getId(@PathVariable("id") Integer id){
        return repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
    }

    @GetMapping
    public List<Animal> getAnimais() {
        return repository.findAll();
    }




}
