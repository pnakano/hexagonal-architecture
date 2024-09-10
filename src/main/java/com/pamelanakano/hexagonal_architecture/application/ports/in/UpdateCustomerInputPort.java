package com.pamelanakano.hexagonal_architecture.application.ports.in;

import com.pamelanakano.hexagonal_architecture.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
