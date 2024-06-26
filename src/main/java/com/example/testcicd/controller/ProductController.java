package com.example.testcicd.controller;

import com.example.testcicd.models.Product;
import com.example.testcicd.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
//    Hellooooo 2
    @Autowired
    private ProductRepository productRepository;

//    Hello World

    //Hello test featrure/test3
    @PostMapping("/save")
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }


    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable long id){
        return productRepository.findById(id).get();
    }
}
