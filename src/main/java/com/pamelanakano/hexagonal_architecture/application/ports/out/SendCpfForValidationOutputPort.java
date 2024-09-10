package com.pamelanakano.hexagonal_architecture.application.ports.out;

public interface SendCpfForValidationOutputPort {

    void send(String cpf);

}
