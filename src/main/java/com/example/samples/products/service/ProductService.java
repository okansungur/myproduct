package com.example.samples.products.service;

import com.example.samples.products.entity.Product;

import java.util.*;

public interface ProductService {
    public List<Product> findOrderedByProductsLimited(int limit);



}
