package enset.net.sale_management.controller;


import enset.net.sale_management.DAO.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/products")
@RestController
public class ProductController {
    @Autowired
    ProductDAO productDAO;
}

