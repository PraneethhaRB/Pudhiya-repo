package com.example.dummy.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dummy.Model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
    // Define custom query methods if needed

}
