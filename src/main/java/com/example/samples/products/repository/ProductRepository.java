package com.example.samples.products.repository;


import com.example.samples.products.entity.Product;
import org.springframework.data.jpa.repository.*;

public interface ProductRepository extends JpaRepository<Product, Long> {

    long deleteById(int id);

}
