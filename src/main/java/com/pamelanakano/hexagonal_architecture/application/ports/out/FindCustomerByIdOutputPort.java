package com.pamelanakano.hexagonal_architecture.application.ports.out;

import com.pamelanakano.hexagonal_architecture.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
