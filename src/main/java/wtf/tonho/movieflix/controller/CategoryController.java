package wtf.tonho.movieflix.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wtf.tonho.movieflix.CategoryMapper.CategoryMapper;
import wtf.tonho.movieflix.controller.request.CategoryRequest;
import wtf.tonho.movieflix.controller.response.CategoryResponse;
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
    public List<CategoryResponse> getAllCategories() {
        List<Category> categories = categoryService.findAll();
       return categories.stream()
               .map(CategoryMapper::toCategoryResponse)
               .toList();
    }

    @PostMapping()
    public CategoryResponse saveCategory(@RequestBody CategoryRequest request) {
        CategoryMapper.toCategory(request)
    }

    @GetMapping("/{id}")
    public CategoryResponse getByCategory(@PathVariable Long id) {
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
