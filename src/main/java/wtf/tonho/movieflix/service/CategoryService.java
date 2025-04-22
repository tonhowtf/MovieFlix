package wtf.tonho.movieflix.service;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wtf.tonho.movieflix.entity.Category;
import wtf.tonho.movieflix.repository.CategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category saveCategory(@RequestBody Category category) {
        return repository.save(category);
    }
}
