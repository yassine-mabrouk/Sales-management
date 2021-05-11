package enset.net.sale_management.DAO;


import enset.net.sale_management.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDAO {
    @Autowired
    ProductRepo productRepo;
}
