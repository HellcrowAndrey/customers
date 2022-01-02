package com.github.customers.controllers;

import com.github.customers.entity.TrustDevice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrustDeviceController extends ReactiveMongoRepository<TrustDevice, String> {
}
