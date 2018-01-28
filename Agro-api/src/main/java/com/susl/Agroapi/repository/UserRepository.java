package com.susl.Agroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.susl.Agroapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
