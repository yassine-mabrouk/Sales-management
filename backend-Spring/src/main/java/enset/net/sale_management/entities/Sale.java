package enset.net.sale_management.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

}
