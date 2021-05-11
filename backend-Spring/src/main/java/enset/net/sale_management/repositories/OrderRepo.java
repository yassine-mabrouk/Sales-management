package enset.net.sale_management.repositories;

import enset.net.sale_management.entities.Order;
import enset.net.sale_management.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface OrderRepo  extends JpaRepository<Order,Long> {
}
