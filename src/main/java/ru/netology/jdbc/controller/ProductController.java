package ru.netology.jdbc.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc.repository.ProductService;
import ru.netology.jdbc.repository.entity.Orders;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products/fetch-product")
    public String fetchProduct(@RequestParam String name) {
        List<Orders> productName = productService.getOrdersByName(name);
        return productName.toString();
    }

}
