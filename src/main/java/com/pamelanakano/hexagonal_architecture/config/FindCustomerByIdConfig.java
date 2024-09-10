package com.pamelanakano.hexagonal_architecture.config;

import com.pamelanakano.hexagonal_architecture.adapters.out.FindCustomerByIdAdapter;
import com.pamelanakano.hexagonal_architecture.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter){
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }

}
