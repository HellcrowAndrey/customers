package com.github.customers.repository;

import com.github.customers.entity.RefreshSession;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshSessionRepo extends ReactiveMongoRepository<RefreshSession, String> {
}
