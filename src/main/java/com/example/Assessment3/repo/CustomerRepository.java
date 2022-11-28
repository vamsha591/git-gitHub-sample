package com.example.Assessment3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Assessment3.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
