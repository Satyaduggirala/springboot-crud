package com.hcat.springbootcrudexample.controller;

import com.hcat.springbootcrudexample.entity.Product;
import com.hcat.springbootcrudexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    private ProductService service;

    @PostMapping("/add product")
    public Product addProduct(@RequestBody Product product)
    {
        return service.saveProduct(product);
    }

    @PostMapping("/add products")
    public List<Product> addProducts(@RequestBody List<Product> products)
    {
        return service.saveProduct(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts()
    {
        return service.getProducts();
    }
    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id)
    {
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(String name)
    {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product)
    {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return service.deleteProduct(id);
    }
}
