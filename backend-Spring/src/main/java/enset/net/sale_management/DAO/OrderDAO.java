package enset.net.sale_management.DAO;


import enset.net.sale_management.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDAO {
    @Autowired
    private OrderRepo orderRepo;
}
