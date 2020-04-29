package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductRepository;
import com.example.entities.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product getProductDetails(Product product) {
		return (Product) productRepository.findAll();
	}
}
