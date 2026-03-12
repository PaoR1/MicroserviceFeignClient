package com.globant.feign.client.application.port.input;

import com.globant.feign.client.domain.model.User;

public interface RetrieveUserInputPort {
    User retrieveUserById(Long id);
}
