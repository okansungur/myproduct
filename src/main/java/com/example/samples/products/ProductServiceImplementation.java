package com.example.samples.products;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import javax.persistence.*;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

@Service
@Transactional

public class ProductServiceImplementation implements ProductService {
    private static final Logger logger = LogManager.getLogger(ProductServiceImplementation.class);
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Product> findOrderedByProductsLimited(int limit) {
        return entityManager.createQuery("SELECT p FROM  Product p ORDER BY p.id",
                Product.class).setMaxResults(limit).getResultList();
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();

    }


}





