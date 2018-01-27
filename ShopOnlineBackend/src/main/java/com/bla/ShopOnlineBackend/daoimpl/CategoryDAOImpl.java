package com.bla.ShopOnlineBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bla.ShopOnlineBackend.dao.CategoryDAO;
import com.bla.ShopOnlineBackend.dto.Category;

//categorysDAO is the object in PageController
@Repository("categorysDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	//initialize at the start
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Laptop");
		category.setDescription("This is some definition for laptop");
		category.setImage_url("Cat_1.jpg");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some definition for mobile");
		category.setImage_url("Cat_2.jpg");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Television");
		category.setDescription("This is some definition for television");
		category.setImage_url("Cat_3.jpg");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}
		return null;
	}

}
