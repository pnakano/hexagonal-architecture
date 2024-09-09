package com.pamelanakano.hexagonal_architecture.adapters.out.client.mapper;

import com.pamelanakano.hexagonal_architecture.adapters.out.client.response.AddressResponse;
import com.pamelanakano.hexagonal_architecture.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
