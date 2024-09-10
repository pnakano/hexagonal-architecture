package com.pamelanakano.hexagonal_architecture.application.ports.in;

import com.pamelanakano.hexagonal_architecture.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
