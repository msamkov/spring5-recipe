package ru.multicon.spring5recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.multicon.spring5recipe.domain.Category;
import ru.multicon.spring5recipe.domain.UnitOfMeasure;
import ru.multicon.spring5recipe.repositories.CategoryRepository;
import ru.multicon.spring5recipe.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/",".index"})
    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category ID:" + categoryOptional.get().getId());
        System.out.println("UOM ID:" + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
