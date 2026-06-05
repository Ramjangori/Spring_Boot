package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bean.ProductNotFoundException;
import com.app.entity.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/product")
public class Controller {

	@Autowired
	private ProductService service;

	@GetMapping("/get-Product/{id}")
	public ResponseEntity<Product> getProduct(
	        @PathVariable("id") Integer id) {

	    Product p = service.getProductOnebyOne(id);

	    if (p != null) {
	        return new ResponseEntity<>(p, HttpStatus.OK);
	    }

	    throw new ProductNotFoundException(
	            "Product Not Found : " + id
	    );
	}
}