package lk.ac.kln.ekel.product_management_rest_api.Respository;

import lk.ac.kln.ekel.product_management_rest_api.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepositoryImpl extends JpaRepository<Product,Long> {

    //we use List here because multiple products are possible
    List<Product> findByCategoryIgnoreCase(String category);

    // we use Optional here because we assume the product name to be unique
    Optional<Product> findByProductNameIgnoreCase(String ProductName);
}
