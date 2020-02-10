package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductInfo;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	
	@Autowired
	ProductService productservice;
	
	
	@PostMapping(value="/insert",consumes= {MediaType.APPLICATION_JSON_VALUE})
	public void insertC( @RequestBody ProductInfo productinfo )
	{
		productservice.insertS(productinfo);
	}
	
	
	@PutMapping( value="/update",consumes= {MediaType.APPLICATION_JSON_VALUE})
	public void updateC(@RequestBody ProductInfo productInfo)
	{
		productservice.updateS(productInfo);
		
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteC(@PathVariable ("id")int id)
	{
		productservice.deleteS(id);
	}
	
	
}
