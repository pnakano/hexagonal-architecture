package com.pamelanakano.hexagonal_architecture.config;

import com.pamelanakano.hexagonal_architecture.adapters.out.FindAddressByZipCodeAdapter;
import com.pamelanakano.hexagonal_architecture.adapters.out.InsertCustomerAdapter;
import com.pamelanakano.hexagonal_architecture.adapters.out.SendCpfValidationAdapter;
import com.pamelanakano.hexagonal_architecture.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }

}
