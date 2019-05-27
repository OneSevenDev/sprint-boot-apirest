package com.trujillodev.hellow_world.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trujillodev.hellow_world.models.entity.Product;
import com.trujillodev.hellow_world.models.services.IProductService;

@CrossOrigin( origins = {
		"http://localhost:4200"
})
@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private IProductService productService;
	
	@GetMapping("/productos")
	public List<Product> findAll() {
		return productService.findAll();
	}
}
