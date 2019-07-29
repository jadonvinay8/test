package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Product;
import com.cg.service.ProductService;

@RestController
public class ProductController {

	@Autowired 
	private ProductService service;
	
	@GetMapping("/")
	public String createSample() {
		Product p1 = new Product(101,"Pizza","Nice",200.00);
		Product p2 = new Product(102,"Windows","Fine",2000.00);
		Product p3 = new Product(103,"Phone","Wooooow",20000.00);
		Product p4 = new Product(104,"Car","dedo",200000.00);
		service.create(p1);
		service.create(p2);
		service.create(p3);
		service.create(p4);
		return "4 Products created";
	}
	
	@GetMapping("/list")
	public List<Product> getAll(){
		return service.getAll();
	}
}
