package com.hcat.springbootcrudexample.repository;

import com.hcat.springbootcrudexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>
{

    Product findByName(String name);
}
