package com.bla.ShopOnlineBackend.dao;

import java.util.List;

import com.bla.ShopOnlineBackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
}
