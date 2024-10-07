package glsia.location.models;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Customer extends User {


    public String city;



    @OneToMany(mappedBy = "customer")
    public List<OrderItem> orderItems;


}
