package glsia.location.services;

import glsia.location.models.Customer;
import glsia.location.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    public Customer getCustomerById(Long id){
        return customerRepository.findById(id).get();
    }
    public Customer updateCustomer(Customer customer){
        return customerRepository.saveAndFlush(customer);
    }
    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }
}
