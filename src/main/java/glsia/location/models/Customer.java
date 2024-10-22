package glsia.location.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer extends User {


//@GeneratedValue(strategy = GenerationType.AUTO)
    //public Long id;
    public String city;
    public String adress;


    @OneToMany(mappedBy = "customer")
    public List<OrderItem> orderItems;


}
