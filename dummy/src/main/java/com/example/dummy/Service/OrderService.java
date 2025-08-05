package com.example.dummy.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dummy.Model.Orders;
import com.example.dummy.Repo.OrderRepository;

@Service
public class OrderService {
@Autowired
private OrderRepository or;
public Orders createOrder(Orders order)
{
    return or.save(order);
}
public List<Orders> getAllOrder()
{
    return or.findAll();
}
public Optional<Orders> getOrderById(Long id)
{
    return or.findById(id);
}
public Orders putOrder(Long id,Orders order)
{
    order.setId(id);
    return or.save(order);
}
public void deleteById(Long id)
{
    or.deleteById(id);
}

}
