package com.shopping.dreamshops.model;

import java.util.List;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "category")
	private List<Product> products;
	

}
