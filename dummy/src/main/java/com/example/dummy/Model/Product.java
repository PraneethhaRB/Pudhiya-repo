package com.example.dummy.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Product {
@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
private Long id;
private String ProductName;
private String Categoty;
private double Price;
private int Stock;
public Product()
{

}
public Product(Long id, String productName, String categoty, double price, int stock) {
    this.id = id;
    ProductName = productName;
    Categoty = categoty;
    Price = price;
    Stock = stock;
}
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getProductName() {
    return ProductName;
}
public void setProductName(String productName) {
    ProductName = productName;
}
public String getCategoty() {
    return Categoty;
}
public void setCategoty(String categoty) {
    Categoty = categoty;
}
public double getPrice() {
    return Price;
}
public void setPrice(double price) {
    Price = price;
}
public int getStock() {
    return Stock;
}
public void setStock(int stock) {
    Stock = stock;
}
@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
@JsonIgnore
// @JsonBackReference(value="product-orderitem")
private List<OrderItem> oitems;

}
