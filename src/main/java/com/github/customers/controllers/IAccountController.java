package com.github.customers.controllers;

import com.github.customers.entity.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountController extends ReactiveMongoRepository<Account, String> {
}
