package com.globant.feignclient.application.port.output;

import com.globant.feignclient.domain.model.User;

public interface RetrieveUserOutputPort {
    User retrieveUserById(Long id);
}
