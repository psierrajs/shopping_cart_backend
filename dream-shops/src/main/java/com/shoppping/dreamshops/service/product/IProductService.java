package com.shoppping.dreamshops.service.product;

import java.util.List;

import com.shoppping.dreamshops.model.Product;
import com.shoppping.dreamshops.request.AddProductRequest;
import com.shoppping.dreamshops.request.ProductUpdateRequest;

public interface IProductService {

	Product addProduct(AddProductRequest request);
	Product getProductById(Long id);
	void deleteProductById(Long id);
	Product updateProduct(ProductUpdateRequest product, Long productId);
	List<Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
	List<Product> getProductsByBrand(String brand);
	List<Product> getProductsByCategoryAndBrand(String category, String brand);
	List<Product> getProductsByName(String name);
	List<Product> getProductsByBrandAndName(String brand, String name);
	Long countProductsByBrandAndName(String brand, String name);
}
