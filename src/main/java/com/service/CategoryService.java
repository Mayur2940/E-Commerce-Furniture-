package com.service;

import com.dto.CategoryDTO;

public interface CategoryService {
	public CategoryDTO addCategory(CategoryDTO category);
	public String removeCategory(int categoryId);
	public String updateCategory(int categoryId,CategoryDTO categoryDTO);
	public CategoryDTO seachCategoryByName(String name);
	public CategoryDTO searchCategoryById(int id);
	

}
