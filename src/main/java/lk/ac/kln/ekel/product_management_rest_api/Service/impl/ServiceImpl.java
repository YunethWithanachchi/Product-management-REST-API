package lk.ac.kln.ekel.product_management_rest_api.Service.impl;

import lk.ac.kln.ekel.product_management_rest_api.DTO.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ServiceImpl {
    ProductDTO addProduct( ProductDTO productDTO);
    List<ProductDTO> getAllProducts();
    List<ProductDTO> searchProducts(String name);
    List<ProductDTO> getProductByCategory(String category);
    void deleteProductByName(String name);
}
