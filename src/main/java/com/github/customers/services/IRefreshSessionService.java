package com.github.customers.services;

import com.github.customers.entity.RefreshSession;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRefreshSessionService extends ReactiveMongoRepository<RefreshSession, String> {
}
