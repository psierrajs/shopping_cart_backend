package com.shoppping.dreamshops.service.product;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppping.dreamshops.exceptions.ResourceNotFoundException;
import com.shoppping.dreamshops.model.Product;
import com.shoppping.dreamshops.repository.ProductRepository;

@Service
public class ProductService implements IProductService {
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Product not found!"));
	}

	@Override
	public void deleteProductById(Long id) {
		productRepository.findById(id).ifPresent(productRepository::delete);

	}

	@Override
	public void updateProduct(Product product, Long productId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByBrandAndName(String brand, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long countProductsByBrandAndName(String brand, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
