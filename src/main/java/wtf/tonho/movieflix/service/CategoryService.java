package wtf.tonho.movieflix.service;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import wtf.tonho.movieflix.entity.Category;
import wtf.tonho.movieflix.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

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

    public Optional<Category> findById(@PathVariable Long id) {
        return repository.findById(id);
    }

    public void deleteByCategoryId(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
