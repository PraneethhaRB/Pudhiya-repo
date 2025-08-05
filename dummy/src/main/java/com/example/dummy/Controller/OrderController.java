package com.example.dummy.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.example.*;
import com.example.dummy.Model.Orders;
import com.example.dummy.Service.OrderService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/orders")
public class OrderController {
@Autowired
private OrderService os;
@GetMapping("/getAll")
public List<Orders> gettingAll() {
    return os.getAllOrder();
}
@GetMapping("/get/{id}")
public Optional<Orders> gotById(@PathVariable Long id)
{
    return os.getOrderById(id);
}
@PostMapping("/creataagudhu")
public ResponseEntity<Orders> cre(@RequestBody Orders o) {

    return ResponseEntity.ok(os.createOrder(o));
}
@PutMapping("put/{id}")
public ResponseEntity<Orders> updatechei(@PathVariable Long id, @RequestBody Orders o) {
    //TODO: process PUT request
    return ResponseEntity.ok(os.putOrder(id, o));
}
@DeleteMapping("/dele/{id}")
public ResponseEntity<Object> deleteusingId(@PathVariable Long id) 
{

    os.deleteById(id);
    return ResponseEntity.ok("Order with Id " + id + " deleted successfully");
}
{

}

}
