package com.example.ProductApi.Service;


import com.example.ProductApi.Model.ProductModel;
import com.example.ProductApi.Reposiotry.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {

    @Autowired
    private Productrepository productrepository;

    public List<ProductModel> getProduct(){
       return productrepository.findAll();

    }
    public ProductModel setProduct(@RequestBody ProductModel productModel){
       return productrepository.save(productModel);
    }
}
