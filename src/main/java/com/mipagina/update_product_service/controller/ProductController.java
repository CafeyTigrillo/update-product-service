package com.mipagina.update_product_service.controller;

import com.mipagina.update_product_service.model.Product;
import com.mipagina.update_product_service.service.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Product", description = "API for updating product details")
public class ProductController {
    @Autowired
    private IProductService productService;

    @Operation(
            summary = "Update a product by ID",
            description = "Updates product details based on the given product ID.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Product updated successfully"),
                    @ApiResponse(responseCode = "404", description = "Product not found"),
                    @ApiResponse(responseCode = "500", description = "Internal server error")
            }
    )
    @PutMapping("/edit/{id_product}")
    public void editProduct(
            @Parameter(description = "ID of the product to be updated", required = true, example = "1")
            @PathVariable Long id_product,
            @RequestBody Product product) {
        productService.editProduct(id_product, product);
    }
}
