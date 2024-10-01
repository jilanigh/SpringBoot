package glsia.location.repositories;

import glsia.location.repositories.Customer;
import glsia.location.repositories.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String ref;
    public Double price;
    public Date date;

    @ManyToMany
    @JoinTable(name = "Order_product",
            joinColumns = @JoinColumn(name = "order_ID"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> product;


    @ManyToOne
    @JoinColumn(name = "customers_id", nullable = true)
    private Customer customer;


}
