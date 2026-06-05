package com.app.service;

import org.springframework.stereotype.Service;

import com.app.bean.ProductNotFoundException;
import com.app.entity.Product;

@Service
public class ProductService {

	public Product getProductOnebyOne(int id) {
		
		if(id==150) {
			
			return new Product(id , "dummy");
		}
		else {
			throw new ProductNotFoundException("Product" + id + "not Exists");
		}
	}
}
