package com.shoppping.dreamshops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppping.dreamshops.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
