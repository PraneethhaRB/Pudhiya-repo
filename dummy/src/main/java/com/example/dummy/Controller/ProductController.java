package com.example.dummy.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.dummy.Service.ProductService;
import com.example.dummy.Model.Product;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/products")
public class ProductController {
@Autowired
private ProductService p;
@PostMapping("/create")
public ResponseEntity<Product> procreate(@RequestBody Product pr) {
    //TODO: process POST request
    
    return ResponseEntity.ok(p.addPRoduct(pr));
}
@GetMapping("/getAll")
public List<Product> getAllProducts()
{
    return p.getAllProducts();
}
@GetMapping("/get/{id}")
public Optional<Product> getProd(@PathVariable Long id)
{
    return p.getPRoductById(id);
}
@PutMapping("path/{id}")
public ResponseEntity<Product> putPr(@PathVariable Long id, @RequestBody Product pro) {
    //TODO: process PUT request
    
    return ResponseEntity.ok(p.putProduct(id, pro));
}
@DeleteMapping("/del/{id}")
public ResponseEntity<Object> deleting(@PathVariable Long id)
{
    p.deleteProduct(id);
    return ResponseEntity.ok("Product with Id " + id + " deleted successfully");
}

}
