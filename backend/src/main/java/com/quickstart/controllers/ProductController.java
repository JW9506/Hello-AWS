package com.quickstart.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.quickstart.dto.ProductDto;

@RestController
public class ProductController {
  
  @GetMapping("/products")
  public List<ProductDto> getProducts() {
    return List.of(ProductDto.builder().id("1").name("Product 1").build(),
                   ProductDto.builder().id("2").name("Product 2").build());
  }
}
