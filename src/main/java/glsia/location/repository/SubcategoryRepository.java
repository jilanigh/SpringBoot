package glsia.location.repository;

import glsia.location.models.Category;
import glsia.location.models.Product;
import glsia.location.models.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory,Long> {

    List<Subcategory> findByTitleAndDescription(String title,String description);
    List<Subcategory> findById(int id);
    List<Subcategory> findByCategory(Category category);
    List<Subcategory> findByProduct(Product product);
}
