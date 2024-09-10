package com.shoppping.dreamshops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppping.dreamshops.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	Category findByName(String name);

}
