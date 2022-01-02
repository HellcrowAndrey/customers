package com.github.customers.repository;

import com.github.customers.entity.TrustDevice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrustDeviceRepo extends ReactiveMongoRepository<TrustDevice, String> {
}
