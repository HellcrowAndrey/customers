package com.github.customers.repository;

import com.github.customers.entity.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends ReactiveMongoRepository<Account, String> {
}
