package com.globant.feign.client.application.usecase;

import com.globant.feign.client.application.port.input.RetrieveUserInputPort;
import com.globant.feign.client.application.port.output.RetrieveUserOutputPort;
import com.globant.feign.client.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RetrieveUserUserCase implements RetrieveUserInputPort {

    @Autowired private RetrieveUserOutputPort outputPort;


    @Override
    public User retrieveUserById(Long id) {
        return outputPort.retrieveUserById(id);
    }
}
