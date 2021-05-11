package enset.net.sale_management.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private Double price ;
    private String barcode ;
}
