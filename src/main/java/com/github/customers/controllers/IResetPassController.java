package com.github.customers.controllers;

import com.github.customers.entity.ResetPassToken;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResetPassController extends ReactiveMongoRepository<ResetPassToken, String> {
}
