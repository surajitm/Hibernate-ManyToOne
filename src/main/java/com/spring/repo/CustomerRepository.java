package com.spring.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	List<Customer> findByName(String name);
	
}
