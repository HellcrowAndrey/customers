package com.github.customers.services;

import com.github.customers.entity.ResetPassToken;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResetPassService extends ReactiveMongoRepository<ResetPassToken, String> {
}
