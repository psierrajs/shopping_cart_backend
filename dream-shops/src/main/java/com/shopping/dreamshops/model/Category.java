package com.shopping.dreamshops.model;

import java.util.List;

import jakarta.persistence.OneToMany;

public class Category {
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "category")
	private List<Product> products;
	

}
