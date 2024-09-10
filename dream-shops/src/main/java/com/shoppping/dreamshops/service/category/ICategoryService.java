package com.shoppping.dreamshops.service.category;

import java.util.List;

import com.shoppping.dreamshops.model.Category;

public interface ICategoryService {
	Category getCategoryBytId(Long id);
	Category getCategoryByName(String name);
	List<Category> getAllCategories();
	Category addCategory(Category category);
	Category updateCategory(Category category);
	void deleteCategoryById(Long id);

}
