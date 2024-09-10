package com.pamelanakano.hexagonal_architecture.application.core.usecase;

import com.pamelanakano.hexagonal_architecture.application.core.domain.Customer;
import com.pamelanakano.hexagonal_architecture.application.ports.in.FindCustomerByIdInputPort;
import com.pamelanakano.hexagonal_architecture.application.ports.in.UpdateCustomerInputPort;
import com.pamelanakano.hexagonal_architecture.application.ports.out.FindAddressByZipCodeOutputPort;
import com.pamelanakano.hexagonal_architecture.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode){
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }

}
