package glsia.location.repository;

import glsia.location.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    List<Category> findCategoryByTitle(String title);
    List<Category> findCategoryByDescriptionAndTitle(String description,String title);
}
