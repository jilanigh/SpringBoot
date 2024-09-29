package glsia.location;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@DiscriminatorValue("CUSTOMER")
public class Customer extends User {
    public String city;

    @OneToMany(mappedBy = "customer")
    public List<OrderItem> orderItems;
}
