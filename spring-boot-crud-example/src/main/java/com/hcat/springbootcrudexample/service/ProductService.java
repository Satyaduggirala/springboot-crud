package com.hcat.springbootcrudexample.service;

import com.hcat.springbootcrudexample.entity.Product;
import com.hcat.springbootcrudexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product Product)
    {
        return repository.save(Product);
    }
    public List<Product> saveProduct(List<Product> Products)
    {
        return repository.saveAll(Products);
    }

    public List<Product> getProducts()
    {
        return repository.findAll();
    }

    public Product getProductById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name)
    {
        return repository.findByName(name);
    }

    public String deleteProduct(int id)
    {
        repository.deleteById(id);
        return "product removed !! " +id;
    }

    public Product updateProduct(Product product)
    {
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }



















}
