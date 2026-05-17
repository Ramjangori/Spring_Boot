package com.ramjan.repository;

import com.ramjan.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.InterfaceAddress;

public interface ProductRepo extends JpaRepository<Product , Integer> {
}
