package com.github.customers.controllers;

import com.github.customers.entity.Customers;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ICustomersController extends ReactiveMongoRepository<Customers, UUID> {
}
