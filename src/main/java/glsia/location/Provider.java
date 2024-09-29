package glsia.location;

import jakarta.persistence.*;

import java.util.List;


@Entity
@DiscriminatorValue("PROVIDER")
public class Provider extends User {
    private String matricule;
    private String service;
    private String company;

    @OneToMany(mappedBy = "provider")
    public List<Product> products;


}
