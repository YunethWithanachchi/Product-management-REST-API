package lk.ac.kln.ekel.product_management_rest_api.Controller;

import jakarta.validation.Valid;
import lk.ac.kln.ekel.product_management_rest_api.DTO.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {
    @PostMapping("/product")
    public ResponseEntity<?> createProduct(@Valid@RequestBody ProductDTO productDTO){
        //code
        return ResponseEntity.status(HttpStatus.CREATED).body("Product created successfully");
    }

}
