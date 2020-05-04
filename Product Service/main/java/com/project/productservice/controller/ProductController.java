package com.project.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.productservice.pojo.ProductPojo;
import com.project.productservice.service.ProductService;

import io.swagger.annotations.Api;

@CrossOrigin

@RestController
//@RequestMapping("product")
@Api
public class ProductController 
{

	@Autowired
	ProductService productService;

	@GetMapping("/prod/{prodId}")
	ProductPojo getProduct(@PathVariable("prodId") Integer prodId) 
	{
		return productService.getproduct(prodId);
		
	}

	@GetMapping("/prod/all")
	List<ProductPojo>getAllProducts()
	{

		return productService.getAllProducts();
		
	}
	
	
	
	@DeleteMapping("/deleteProd/{prodId}")
	public ResponseEntity deleteProduct(@PathVariable("prodId") Integer prodId)
	{
		 productService.deleteProduct(prodId);
		 return new ResponseEntity("Product deleted Successfully", HttpStatus.OK);
		
	}
	
	@PostMapping("/addProd")
	ProductPojo addProduct(@RequestBody ProductPojo productPojo)
	{
		return productService.addProduct(productPojo);

	}

	
	@PutMapping("/product")
	ProductPojo updateProduct(@RequestBody ProductPojo productPojo)
	{
		return productService.upadateProduct(productPojo);
		
	}
}
