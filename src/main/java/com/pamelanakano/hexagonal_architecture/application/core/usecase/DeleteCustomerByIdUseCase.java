package com.pamelanakano.hexagonal_architecture.application.core.usecase;

import com.pamelanakano.hexagonal_architecture.application.core.domain.Customer;
import com.pamelanakano.hexagonal_architecture.application.ports.in.DeleteCustomerByIdInputPort;
import com.pamelanakano.hexagonal_architecture.application.ports.in.FindCustomerByIdInputPort;
import com.pamelanakano.hexagonal_architecture.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    public void delete(String id){
        Customer customer = findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }
}
