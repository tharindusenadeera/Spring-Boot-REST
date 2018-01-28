package com.susl.Agroapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.susl.Agroapi.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByCategoryId(Long Id);
}
