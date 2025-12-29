package lk.ac.kln.ekel.product_management_rest_api.Respository;

import lk.ac.kln.ekel.product_management_rest_api.Entity.Product;

import java.util.List;

public class ProductRepository implements ProductRepositoryImpl {

    @Override
    public List<Product> findByCategoryIgnoreCase(String category) {
        return null;
    }

    @Override
    public List<Product> findByProductNameIgnoreCase(String ProductName) {
        return null;
    }
}
