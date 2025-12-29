package lk.ac.kln.ekel.product_management_rest_api.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String productId;
    @NotBlank(message = "Product name should not be empty")
    private String productName;
    @NotBlank(message = "Category must not be empty")
    private String category;
    @Min(value = 1,message = "Price must be greater than 0")
    private Double price;
    @Min(value = 1, message = "Quantity must be atleast 1")
    private int quantity;

    public ProductDTO(String productName, String category, Double price, int quantity) {
    }
}
