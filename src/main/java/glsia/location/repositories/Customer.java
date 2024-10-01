package glsia.location.repositories;

import glsia.location.repositories.User;
import jakarta.persistence.*;

import java.util.List;

@Entity

public class Customer extends User {

    public String city;

    @OneToMany(mappedBy = "customer")
    public List<OrderItem> orderItems;




}
