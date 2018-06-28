package ru.multicon.spring5recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.multicon.spring5recipe.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
    Optional<UnitOfMeasure> findByDescription(String description);

}
