package wtf.tonho.movieflix.CategoryMapper;


import lombok.experimental.UtilityClass;
import wtf.tonho.movieflix.controller.response.CategoryResponse;
import wtf.tonho.movieflix.entity.Category;

@UtilityClass

public class CategoryMapper {

   public static Category toCategory(Category categoryRequest) {
       return Category
               .builder()
               .name(categoryRequest.getName())
               .build();
   }

   public static CategoryResponse toCategoryResponse(Category category) {
        return CategoryResponse
                .builder()
                .id(category.getId())
                .name(category.getName())
                .build();
   }
}
