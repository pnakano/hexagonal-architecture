package com.pamelanakano.hexagonal_architecture.application.core.usecase;

import com.pamelanakano.hexagonal_architecture.application.core.domain.Customer;
import com.pamelanakano.hexagonal_architecture.application.core.exceptions.CustomerException;
import com.pamelanakano.hexagonal_architecture.application.ports.in.FindCustomerByIdInputPort;
import com.pamelanakano.hexagonal_architecture.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id).orElseThrow(() -> new CustomerException("Customer not found"));
    }

}
