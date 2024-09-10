package com.shoppping.dreamshops.service.product;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppping.dreamshops.exceptions.ProductNotFoundException;
import com.shoppping.dreamshops.exceptions.ResourceNotFoundException;
import com.shoppping.dreamshops.model.Product;
import com.shoppping.dreamshops.repository.ProductRepository;
import com.shoppping.dreamshops.request.AddProductRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {
	private final ProductRepository productRepository;

	@Override
	public Product addProduct(AddProductRequest request) {
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
		productRepository.findById(id)
		.ifPresentOrElse(productRepository::delete,
				()->{throw new ProductNotFoundException("Product not found!");});

	}

	@Override
	public void updateProduct(Product product, Long productId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		return productRepository.findByCategoryName(category);
	}

	@Override
	public List<Product> getProductsByBrand(String brand) {
		return productRepository.findByBrand(brand);
	}

	@Override
	public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
		return productRepository.findByCategoryNameAndBrand(category, brand);
	}

	@Override
	public List<Product> getProductsByName(String name) {
		return productRepository.findByName(name);
	}

	@Override
	public List<Product> getProductsByBrandAndName(String brand, String name) {
		return productRepository.findByBrandAndName(brand, name);
	}

	@Override
	public Long countProductsByBrandAndName(String brand, String name) {
		return productRepository.countByBrandAndName(brand, name);
	}

}
