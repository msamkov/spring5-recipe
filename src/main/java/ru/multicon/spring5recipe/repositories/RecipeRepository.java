package ru.multicon.spring5recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.multicon.spring5recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
