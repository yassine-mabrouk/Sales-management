package enset.net.sale_management.DAO;


import enset.net.sale_management.entities.Product;
import enset.net.sale_management.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDAO {
    @Autowired
    ProductRepo productRepo;
    public  Product addProduct(Product p ){
        return  this.productRepo.save(p);
    }
    public  Product  updateProduct(Product p ){
        return  this.productRepo.save(p);
    }


    public  void deleteProduct (Long id ){
        this.productRepo.deleteById(id);
    }
}

