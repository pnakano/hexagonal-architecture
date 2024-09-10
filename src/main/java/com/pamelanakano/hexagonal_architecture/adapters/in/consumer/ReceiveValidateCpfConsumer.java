package com.pamelanakano.hexagonal_architecture.adapters.in.consumer;

import com.pamelanakano.hexagonal_architecture.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.pamelanakano.hexagonal_architecture.adapters.in.consumer.message.CustomerMessage;
import com.pamelanakano.hexagonal_architecture.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidateCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "customervalidators")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }

}
