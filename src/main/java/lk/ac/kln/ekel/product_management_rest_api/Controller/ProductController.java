package lk.ac.kln.ekel.product_management_rest_api.Controller;

import jakarta.validation.Valid;
import lk.ac.kln.ekel.product_management_rest_api.DTO.ProductDTO;
import lk.ac.kln.ekel.product_management_rest_api.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> addProduct(@Valid@RequestBody ProductDTO productDTO){
        ProductDTO savedProduct = productService.addProduct(productDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }
    @GetMapping("/category/{category}")
    public  ResponseEntity<List<ProductDTO>> getProductsByCategory(@PathVariable String category){
        return ResponseEntity.ok(productService.getProductByCategory(category));
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<String> deleteProductByName(@PathVariable String name){
        productService.deleteProductByName(name);
        return ResponseEntity.ok("Product deleted successfully");
    }
}
