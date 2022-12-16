package com.example.springzon.controller;

import com.example.springzon.entity.Product;
import com.example.springzon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //utilizzo un web service rest
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

  //  @GetMapping("/all")
   // public List<Product> getAllProduct(){
    //    return productService.findAll();
    //}
    @GetMapping("/all")
    public List<Product> getAllProduct(){
        return productService.findAll();
    }

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }
    @PutMapping("/updateProduct/{id_product}")
    public void updateProduct(@RequestBody Product product,@PathVariable Long id_product){
        productService.updateProduct(id_product,product);
    }

    @DeleteMapping("/deleteProduct/{id_product}")
    public void deleteProduct(@PathVariable Long id_product){
        productService.deleteProduct(id_product);
    }




}
