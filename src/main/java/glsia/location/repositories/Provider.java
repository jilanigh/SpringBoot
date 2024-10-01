package glsia.location.repositories;

import glsia.location.repositories.Product;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Provider extends User {
    private String matricule;
    private String service;
    private String company;

    @OneToMany(mappedBy = "provider")
    public List<Product> products;

}
