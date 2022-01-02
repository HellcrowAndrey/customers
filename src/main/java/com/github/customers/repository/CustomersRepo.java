package com.github.customers.repository;

import com.github.customers.entity.Customers;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomersRepo extends ReactiveMongoRepository<Customers, UUID> {
}
