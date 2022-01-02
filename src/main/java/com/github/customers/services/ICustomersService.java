package com.github.customers.services;

import com.github.customers.entity.Customers;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ICustomersService extends ReactiveMongoRepository<Customers, UUID> {
}
