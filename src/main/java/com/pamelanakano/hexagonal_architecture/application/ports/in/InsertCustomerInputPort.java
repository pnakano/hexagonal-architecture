package com.pamelanakano.hexagonal_architecture.application.ports.in;

import com.pamelanakano.hexagonal_architecture.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
