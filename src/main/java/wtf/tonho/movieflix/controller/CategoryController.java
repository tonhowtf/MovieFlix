package wtf.tonho.movieflix.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wtf.tonho.movieflix.entity.Category;
import wtf.tonho.movieflix.repository.CategoryRepository;
import wtf.tonho.movieflix.service.CategoryService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movieflix/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;


    @GetMapping()
    public List<Category> getAllCategories() {
        return categoryService.findAll();
    }

    @PostMapping()
    public Category saveCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @GetMapping("/{id}")
    public Category getByCategory(@PathVariable Long id) {
       Optional<Category> category = categoryService.findById(id);
       if(category.isPresent()) {
           return category.get();
       }
       return null;
    }

    @DeleteMapping("/{id}")
    public void deleteByCategoryId(@PathVariable Long id) {
        categoryService.deleteByCategoryId(id);
    }



}
