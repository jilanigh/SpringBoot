package glsia.location.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Provider extends User {
    private String matricule;
    private String service;
    private String company;

    @OneToMany(mappedBy = "provider")
    public List<Product> products;

}
