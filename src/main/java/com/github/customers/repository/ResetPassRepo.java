package com.github.customers.repository;

import com.github.customers.entity.ResetPassToken;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResetPassRepo extends ReactiveMongoRepository<ResetPassToken, String> {
}
