package com.pamelanakano.hexagonal_architecture.adapters.out.client.response;

import lombok.Data;

/**
 * Como aqui está fora do core, pode utilizar frameworks - nesse caso, o lombok
 * */
@Data
public class AddressResponse {

    private String street;

    private String city;

    private String state;

}
