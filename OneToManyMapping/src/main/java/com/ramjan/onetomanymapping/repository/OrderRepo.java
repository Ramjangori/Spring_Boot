package com.ramjan.onetomanymapping.repository;

import com.ramjan.onetomanymapping.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
