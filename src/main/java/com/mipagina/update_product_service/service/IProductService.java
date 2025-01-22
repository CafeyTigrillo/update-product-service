package com.mipagina.update_product_service.service;

import com.mipagina.update_product_service.model.Product;

public interface IProductService {

    public void editProduct(Long id_product, Product product);
    public Product findProduct(Long id_product);
    public void saveProduct(Product product);
}
