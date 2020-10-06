package github.EduMacedoEng.PredictAnimal.Model.Repository;

import github.EduMacedoEng.PredictAnimal.Model.Entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
