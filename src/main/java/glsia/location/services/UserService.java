package glsia.location.services;

import glsia.location.models.User;
import glsia.location.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User getUserById(Long id){
        return userRepository.findById(id).get();
    }
    public User updateUser(User user){
        return userRepository.saveAndFlush(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
