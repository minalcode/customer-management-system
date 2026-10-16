
package com.mongodb.example.spring_mongodb.repository;

import com.mongodb.example.spring_mongodb.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
