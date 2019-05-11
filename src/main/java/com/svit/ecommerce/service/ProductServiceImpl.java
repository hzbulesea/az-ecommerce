package com.svit.ecommerce.service;

import com.svit.ecommerce.exception.ResourceNotFoundException;
import com.svit.ecommerce.model.Product;
import com.svit.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
	
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
	
    @Override
    public Product getProduct(long id) {
        return productRepository
          .findById(id)
          .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }
}
