package com.pamelanakano.hexagonal_architecture.adapters.out;

import com.pamelanakano.hexagonal_architecture.adapters.out.repository.CustomerRepository;
import com.pamelanakano.hexagonal_architecture.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }

}
