package enset.net.sale_management.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Double total;

}
