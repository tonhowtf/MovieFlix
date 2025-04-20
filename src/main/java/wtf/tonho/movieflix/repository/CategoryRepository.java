package wtf.tonho.movieflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wtf.tonho.movieflix.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
