package com.example.testcicd;

import com.example.testcicd.models.Product;
import com.example.testcicd.repositories.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestCicdApplicationTests {
//    @Autowired
//    private ProductRepository productRepository;


    @Test
//    @Order(1)
//    @Rollback(value = false)
    void contextLoads() {
//        System.out.println("Start server successfully");

    }

//    @Test
//    @Order(2)
//    @Rollback(value = false)
//    public void testSaveProduct() {
//        Product product = Product.builder().name("Test Product").build();
//        productRepository.save(product);
//        Assertions.assertThat(product.getId()).isGreaterThan(0);
//    }
//
//    @Test
//    @Order(3)
//    @Rollback(value = false)
//    public void testGetAllProduct() {
//        List<Product> products = productRepository.findAll();
//        Assertions.assertThat(products).size().isGreaterThan(0);
//    }
//
//    @Test
//    @Order(4)
//    @Rollback(value = false)
//    public void testGetOneProduct() {
//        Product product = productRepository.findById(2L).get();
//        Assertions.assertThat(product.getId()).isEqualTo(2L);
//    }
//
//    @Test
//    @Order(5)
//    @Rollback(value = false)
//    public void testDeleteProduct() {
//        productRepository.deleteById(1L);
//        Product product = productRepository.findById(1L).orElse(null);
//        Assertions.assertThat(product).isNull();
//    }

}
