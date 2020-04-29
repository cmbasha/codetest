package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Product;
import com.example.service.ProductService;

@RestController
@RequestMapping("domain")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/api/getProductDetails") 
	public Product getProductDetails(Product product)
	{
	   return productService.getProductDetails(product);
	}
}
