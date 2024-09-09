package com.pamelanakano.hexagonal_architecture.adapters.out;

import com.pamelanakano.hexagonal_architecture.adapters.out.client.FindAddressByZipCodeClient;
import com.pamelanakano.hexagonal_architecture.adapters.out.client.mapper.AddressResponseMapper;
import com.pamelanakano.hexagonal_architecture.application.core.domain.Address;
import com.pamelanakano.hexagonal_architecture.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}