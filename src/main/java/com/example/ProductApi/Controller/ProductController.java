package com.example.ProductApi.Controller;


import com.example.ProductApi.Model.ProductModel;
import com.example.ProductApi.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private  ProductService productService;
    @GetMapping("/getProduct")
    public List<ProductModel> getProduct(){

        return productService.getProduct();
    }
    @PostMapping("/setProduct")
    public ProductModel setProduct(@RequestBody ProductModel productModel){
       return productService.setProduct(productModel);

    }
}