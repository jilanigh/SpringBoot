package glsia.location.repository;

import glsia.location.models.Product;
import glsia.location.models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByName(String name);
    List<Product> findByDescription(String description);

}
