package com.pamelanakano.hexagonal_architecture.config;

import com.pamelanakano.hexagonal_architecture.adapters.out.FindAddressByZipCodeAdapter;
import com.pamelanakano.hexagonal_architecture.adapters.out.UpdateCustomerAdapter;
import com.pamelanakano.hexagonal_architecture.application.core.usecase.FindCustomerByIdUseCase;
import com.pamelanakano.hexagonal_architecture.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
