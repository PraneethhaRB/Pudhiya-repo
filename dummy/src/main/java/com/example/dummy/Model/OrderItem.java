package com.example.dummy.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private int Quantity;
private double subTotal;
@ManyToOne
@JoinColumn(name = "order_id")
@JsonBackReference(value= "order-item")
// @JsonIgnore
private Orders order;
@ManyToOne
// @JsonManagedReference(value = "product-orderitem")
@JoinColumn(name = "product_id")
private Product product;
public OrderItem()
{
    
}
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public int getQuantity() {
    return Quantity;
}
public void setQuantity(int quantity) {
    Quantity = quantity;
}
public double getSubTotal() {
    return subTotal;
}
public void setSubTotal(double subTotal) {
    this.subTotal = subTotal;
}
public Orders getOrder() {
    return order;
}
public void setOrder(Orders order) {
    this.order = order;
}
public Product getProduct() {
    return product;
}
public void setProduct(Product product) {
    this.product = product;
}
public OrderItem(Long id, int quantity, double subTotal, Orders order, Product product) {
    this.id = id;
    Quantity = quantity;
    this.subTotal = subTotal;
    this.order = order;
    this.product = product;
}
}
