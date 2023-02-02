package com.example.onlinemarket.services;

import com.example.onlinemarket.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "PlayStation 5", "Simple description", 800, "Chisinau", "Markus"));
        products.add(new Product(++ID, "Iphone X", "Simple description", 1100, "Chisinau", "Tibet"));
    }

    public List<Product> listProducts() {
        return products;
    }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId() == id);
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
