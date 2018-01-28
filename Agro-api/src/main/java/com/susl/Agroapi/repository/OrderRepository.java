package com.susl.Agroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.susl.Agroapi.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
