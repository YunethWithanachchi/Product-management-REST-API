package lk.ac.kln.ekel.product_management_rest_api.Service;

import lk.ac.kln.ekel.product_management_rest_api.DTO.ProductDTO;
import lk.ac.kln.ekel.product_management_rest_api.Entity.Product;
import lk.ac.kln.ekel.product_management_rest_api.Respository.ProductRepository;
import lk.ac.kln.ekel.product_management_rest_api.Service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService implements ServiceImpl {
    @Autowired
    private ProductRepository productRepository;

    private ProductDTO convertToDTO(Product product) {
        return new ProductDTO(product.getProductId().toString(),product.getProductName(), product.getCategory(),product.getPrice(),product.getQuantity());
    }

    private Product convertToEntity(ProductDTO dto) {
        return new Product(null, dto.getProductName(), dto.getCategory(), dto.getPrice(), dto.getQuantity());
    }
    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        Product product = convertToEntity(productDTO);
        Product savedProduct = productRepository.save(product);
        return convertToDTO(savedProduct);
    }

    @Override
    public List<ProductDTO> getAllProducts() {

        return productRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> searchProducts(String name) {

        return productRepository.findByCategoryIgnoreCase(name).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getProductByCategory(String category) {
        return productRepository.findByProductNameIgnoreCase(category).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteProductByName(String name) {
        Optional<Product> products = productRepository.findByProductNameIgnoreCase(name);
        productRepository.deleteAll(products.stream().toList());
    }
}
