package com.shoppping.dreamshops.service.category;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppping.dreamshops.exceptions.ResourceNotFoundException;
import com.shoppping.dreamshops.model.Category;
import com.shoppping.dreamshops.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService{

	private final CategoryRepository categoryRepository;
	
	@Override
	public Category getCategoryBytId(Long id) {
		return categoryRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Category not foun!d"));
	}

	@Override
	public Category getCategoryByName(String name) {
		return categoryRepository.findByName(name);
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCategoryById(Long id) {
		// TODO Auto-generated method stub
		
	}
	

}
