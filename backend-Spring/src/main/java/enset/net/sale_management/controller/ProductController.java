package enset.net.sale_management.controller;


import enset.net.sale_management.DAO.ProductDAO;
import enset.net.sale_management.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/products")
@RestController
public class ProductController {
    @Autowired
    ProductDAO productDAO;

    @PostMapping(path = "addProduct")
    public Product addProduct (@RequestBody Product p ){
        return  this.productDAO.addProduct(p);
    }
    @PostMapping(path = "updateProduct")
    public Product updateProduct (@RequestBody Product p ){
        return  this.productDAO.updateProduct(p);
    }
    @GetMapping(path = "/deleteProduct")
    public String deleteProduct (@RequestParam(required =true) Long id ){
        this.productDAO.deleteProduct(id);
        return "success";
    }

}

