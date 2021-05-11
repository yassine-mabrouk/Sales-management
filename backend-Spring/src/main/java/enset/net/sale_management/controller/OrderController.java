package enset.net.sale_management.controller;

import enset.net.sale_management.DAO.OrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/orders")
@RestController
public class OrderController {
    @Autowired
    private OrderDAO orderDAO;
}
