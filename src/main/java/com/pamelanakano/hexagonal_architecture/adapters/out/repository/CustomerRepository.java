package com.pamelanakano.hexagonal_architecture.adapters.out.repository;

import com.pamelanakano.hexagonal_architecture.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
