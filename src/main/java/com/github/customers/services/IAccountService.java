package com.github.customers.services;

import com.github.customers.entity.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountService extends ReactiveMongoRepository<Account, String> {
}
