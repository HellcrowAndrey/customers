package com.github.customers.services;

import com.github.customers.entity.TrustDevice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrustDeviceService extends ReactiveMongoRepository<TrustDevice, String> {
}
