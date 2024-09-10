package com.pamelanakano.hexagonal_architecture.adapters.out;

import com.pamelanakano.hexagonal_architecture.adapters.out.repository.CustomerRepository;
import com.pamelanakano.hexagonal_architecture.adapters.out.repository.mapper.CustomerEntityMapper;
import com.pamelanakano.hexagonal_architecture.application.core.domain.Customer;
import com.pamelanakano.hexagonal_architecture.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
