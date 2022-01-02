package com.github.customers.controllers;

import com.github.customers.entity.RefreshSession;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRefreshSessionController extends ReactiveMongoRepository<RefreshSession, String> {
}
