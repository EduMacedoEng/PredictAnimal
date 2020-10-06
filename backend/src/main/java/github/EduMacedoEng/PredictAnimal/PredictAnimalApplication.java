package github.EduMacedoEng.PredictAnimal;

import github.EduMacedoEng.PredictAnimal.Model.Entity.Animal;
import github.EduMacedoEng.PredictAnimal.Model.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PredictAnimalApplication {

    @Bean
    public CommandLineRunner run (@Autowired AnimalRepository repository){
        return args -> {
            Animal a1 = Animal.builder().nome("Jumento").tipo("Terrestre").descricao("Inteligente").build();
            Animal a2 = Animal.builder().nome("Tubarão").tipo("Aquatico").descricao("Rápido").build();
            repository.save(a1); repository.save(a2);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(PredictAnimalApplication.class, args);
    }
}
