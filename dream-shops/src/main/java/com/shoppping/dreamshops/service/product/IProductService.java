package com.shoppping.dreamshops.service.product;

import java.util.List;

import com.shoppping.dreamshops.model.Product;

public interface IProductService {

	Product addProduct(Product product);
	Product getProductById(Long id);
	void deleteProductById(Long id);
	void updateProduct(Product product, Long productId);
	List<Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
	List<Product> getProductByBrand(String brand);
	List<Product> getProductsByCategoryAndBrand(String category, String brand);
	List<Product> getProductsByName(String name);
	List<Product> getProductsByBrandAndName(String brand, String name);
	Long countProductsByBrandAndName(String brand, String name);
}
