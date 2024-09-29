package glsia.location;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String name;
    public Double price;
    public String description;

    @OneToMany(mappedBy = "product")
    public List<Subcategory> subcategories;


    @ManyToOne
    @JoinColumn(name = "order_id", nullable = true)
    private OrderItem order;

    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = true)
    private Provider provider;
}

