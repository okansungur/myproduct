package com.example.samples.products;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.*;

import org.springframework.web.bind.annotation.*;


import java.util.*;

@RestController

@RequestMapping(value = "/commonapi", method = RequestMethod.GET, produces = "application/json")

public class RepoController {
    private static final Logger logger = LogManager.getLogger(RepoController.class);
    @Autowired
    private ProductServiceImplementation productService;

    @GetMapping("/hello")
    public String sayHello() {
        logger.info("hello service is called" );
        return "Hello From Java ";
    }


    @GetMapping("/products")
    public List<Product> getproducts() {
        List<Product> products = null;
        products = productService.getAllProducts();
        logger.info("products service is called" );
        return products;

    }
}
