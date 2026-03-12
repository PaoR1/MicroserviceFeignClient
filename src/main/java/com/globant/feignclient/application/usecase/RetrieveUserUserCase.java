package com.globant.feignclient.application.usecase;

import com.globant.feignclient.application.port.input.RetrieveUserInputPort;
import com.globant.feignclient.application.port.output.RetrieveUserOutputPort;
import com.globant.feignclient.domain.model.User;
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
