package com.product.RESTapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.RESTapi.model.Product;
import com.product.RESTapi.model.ProductRequest;


public interface ProductRepo extends JpaRepository<Product, Long> {

}
