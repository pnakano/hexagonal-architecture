package com.pamelanakano.hexagonal_architecture.config;

import com.pamelanakano.hexagonal_architecture.adapters.out.DeleteCustomerByIdAdapter;
import com.pamelanakano.hexagonal_architecture.adapters.out.FindAddressByZipCodeAdapter;
import com.pamelanakano.hexagonal_architecture.adapters.out.InsertCustomerAdapter;
import com.pamelanakano.hexagonal_architecture.application.core.usecase.DeleteCustomerByIdUseCase;
import com.pamelanakano.hexagonal_architecture.application.core.usecase.FindCustomerByIdUseCase;
import com.pamelanakano.hexagonal_architecture.application.core.usecase.InsertCustomerUseCase;
import com.pamelanakano.hexagonal_architecture.application.ports.in.FindCustomerByIdInputPort;
import com.pamelanakano.hexagonal_architecture.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }

}
