package com.example.samples.products;


import org.springframework.data.jpa.repository.*;

public interface ProductRepository extends JpaRepository<Product, Long> {

    long deleteById(int id);

}
