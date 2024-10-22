package glsia.location.repository;

import glsia.location.models.Provider;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<Provider,Long> {
    List<Provider> findByMatricule(String matricule);
    List<Provider> findByCompany(String company);

}
