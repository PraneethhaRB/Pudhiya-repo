package com.example.dummy.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dummy.Repo.ProductRepository;

import com.example.dummy.Model.Product;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product addPRoduct(Product p)
    {
        return productRepository.save(p);
    }
    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }
    public Optional<Product> getPRoductById(Long id)
    {
        return productRepository.findById(id);
    }
    public Product putProduct(Long id,Product pr)
    {
        pr.setId(id);
        return productRepository.save(pr);
    }
    public void deleteProduct(Long id)
    {
        productRepository.deleteById(id);
    }

}
