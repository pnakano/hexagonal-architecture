package com.pamelanakano.hexagonal_architecture.application.ports.out;

import com.pamelanakano.hexagonal_architecture.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
