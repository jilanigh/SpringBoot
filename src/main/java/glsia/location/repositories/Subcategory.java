package glsia.location.repositories;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String title;
    public String description;

    @ManyToOne
    @JoinColumn(name = "category_ID")
    public Category category;

    @ManyToOne
    @JoinColumn(name = "product_ID")
    public Product product;



}

