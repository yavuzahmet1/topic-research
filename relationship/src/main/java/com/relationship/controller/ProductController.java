package com.relationship.controller;

import com.relationship.model.Product;
import com.relationship.repository.ProductDao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProductController {
    private ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @PostMapping("/add")
    public Product add(@RequestBody Product product) {
        return productDao.save(product);
    }

    @GetMapping("/getall")
    public List<Product> getAll() {
        return productDao.findAll();
    }
}
