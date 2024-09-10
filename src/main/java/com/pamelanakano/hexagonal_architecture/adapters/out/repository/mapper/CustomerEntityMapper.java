package com.pamelanakano.hexagonal_architecture.adapters.out.repository.mapper;

import com.pamelanakano.hexagonal_architecture.adapters.out.repository.entity.CustomerEntity;
import com.pamelanakano.hexagonal_architecture.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
