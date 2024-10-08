package glsia.location.repository;

import glsia.location.models.Customer;
import glsia.location.models.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    /*List<User> findById(int id);
    List<User> findByNameAndPhone(String name,int phone);*/
    List<User> findByName(String name);
    List<User> findByEmail(String email);

}
