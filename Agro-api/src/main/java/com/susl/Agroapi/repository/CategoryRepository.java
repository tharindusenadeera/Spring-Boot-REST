package com.susl.Agroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.susl.Agroapi.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

}
