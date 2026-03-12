package com.globant.feignclient.application.port.input;

import com.globant.feignclient.domain.model.User;

public interface RetrieveUserInputPort {
    User retrieveUserById(Long id);
}
