package lk.ac.kln.ekel.product_management_rest_api.Service;

import lk.ac.kln.ekel.product_management_rest_api.DTO.ProductDTO;
import lk.ac.kln.ekel.product_management_rest_api.Entity.Product;
import lk.ac.kln.ekel.product_management_rest_api.Respository.ProductRepository;
import lk.ac.kln.ekel.product_management_rest_api.Service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService implements ServiceImpl {
    @Autowired
    private ProductRepository productRepository;

    private ProductDTO convertToDTO(Product product) {
        return new ProductDTO(product.getProductName(), product.getCategory(),product.getPrice(),product.getQuantity());
    }

    private Product convertToEntity(ProductDTO dto) {
        return new Product(null, dto.getProductName(), dto.getCategory(), dto.getPrice(), dto.getQuantity());
    }
    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return null;
    }

    @Override
    public List<ProductDTO> searchProducts(String name) {
        return null;
    }

    @Override
    public void deleteProductByName(String name) {

    }
}
