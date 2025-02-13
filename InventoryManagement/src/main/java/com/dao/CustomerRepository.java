package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Customer findByEmail(String email);
}
