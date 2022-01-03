package com.example.samples.products.service;

import com.example.samples.products.entity.Product;
import com.example.samples.products.repository.ProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

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





