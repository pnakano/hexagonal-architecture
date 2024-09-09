package com.pamelanakano.hexagonal_architecture.application.ports.out;

import com.pamelanakano.hexagonal_architecture.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
