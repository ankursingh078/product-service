package com.microservices.project.service;

import com.microservices.project.model.ProductRequest;
import com.microservices.project.model.ProductResponse;

public interface ProductService {

    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
