package ru.multicon.spring5recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.multicon.spring5recipe.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
