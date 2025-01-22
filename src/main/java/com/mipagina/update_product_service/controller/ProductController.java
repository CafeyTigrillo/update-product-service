package com.mipagina.update_product_service.controller;

import com.mipagina.update_product_service.model.Product;
import com.mipagina.update_product_service.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @PutMapping("/edit/{id_product}")
    public void editProduct(@PathVariable Long id_product,
                            @RequestBody Product product){
        productService.editProduct(id_product,product);
    }
}
