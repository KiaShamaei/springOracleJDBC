package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Products;

@RestController
public class PorductController {

	
	@RequestMapping(value = "/product")
	public String getProduct() {
		Products products = new Products(1,"product1","10000");
		String s = String.valueOf(products.getId())+products.getName() + products.getPrice() ;
		return s ;
	}
}
