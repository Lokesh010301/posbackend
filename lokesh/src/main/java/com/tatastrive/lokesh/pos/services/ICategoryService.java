package com.tatastrive.lokesh.pos.services;

import java.util.List;

import com.tatastrive.lokesh.pos.entity.Category;



public interface ICategoryService {
	public Category addCategory(Category category);
	//public Category addCountries(List<E>);
	public Category getCategory(long id);
	public List<Category> getCategories();
	public Category updateCategory(long id,Category category);
	public String  deleteCategory(long id);
}
