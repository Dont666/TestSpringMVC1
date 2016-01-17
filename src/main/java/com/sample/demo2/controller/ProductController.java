package com.sample.demo2.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.demo2.models.Product;
import com.sample.demo2.service.ProductSerivce;

@Controller
@RequestMapping("/product")
public class ProductController {
@Resource
ProductSerivce productService;
	
	
	@RequestMapping("/{name}")
	public String testController(Model model,@PathVariable String name)
	{
		Product p = productService.getProductByName(name);
		model.addAttribute(p);
		model.addAttribute("test", "This is controller Test");
		return "home2";
	}
}
