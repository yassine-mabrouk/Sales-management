package enset.net.sale_management.controller;

import enset.net.sale_management.DAO.SaleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/sales")
@RestController
public class SaleController {
     @Autowired
    private SaleDAO saleDAO;
}
