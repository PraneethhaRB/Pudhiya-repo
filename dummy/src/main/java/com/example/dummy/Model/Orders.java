package com.example.dummy.Model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String CustomerName;
private String CustomerEmail;
private String CustomerAddress;
private LocalDateTime OrderDate;
private String OrderStatus;
private Double TotalAmount;
public Orders()
{

}
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getCustomerName() {
    return CustomerName;
}
public void setCustomerName(String customerName) {
    CustomerName = customerName;
}
public String getCustomerEmail() {
    return CustomerEmail;
}
public void setCustomerEmail(String customerEmail) {
    CustomerEmail = customerEmail;
}
public String getCustomerAddress() {
    return CustomerAddress;
}
public void setCustomerAddress(String customerAddress) {
    CustomerAddress = customerAddress;
}
public LocalDateTime getOrderDate() {
    return OrderDate;
}
public void setOrderDate(LocalDateTime orderDate) {
    OrderDate = orderDate;
}
public String getOrderStatus() {
    return OrderStatus;
}
public void setOrderStatus(String orderStatus) {
    OrderStatus = orderStatus;
}
public Double getTotalAmount() {
    return TotalAmount;
}
public void setTotalAmount(Double totalAmount) {
    TotalAmount = totalAmount;
}
public Orders(Long id, String customerName, String customerEmail, String customerAddress, LocalDateTime orderDate,
        String orderStatus, Double totalAmount) {
    this.id = id;
    CustomerName = customerName;
    CustomerEmail = customerEmail;
    CustomerAddress = customerAddress;
    OrderDate = orderDate;
    OrderStatus = orderStatus;
    TotalAmount = totalAmount;
}
@OneToMany(mappedBy="order", cascade = CascadeType.ALL)
@JsonManagedReference(value = "order-item")
private List<OrderItem> items;
}
