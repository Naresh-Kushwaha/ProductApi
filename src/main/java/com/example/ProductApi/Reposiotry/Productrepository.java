package com.example.ProductApi.Reposiotry;

import com.example.ProductApi.Model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  Productrepository extends MongoRepository<ProductModel,Integer> {
}
