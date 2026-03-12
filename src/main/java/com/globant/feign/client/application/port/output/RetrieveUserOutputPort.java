package com.globant.feign.client.application.port.output;

import com.globant.feign.client.domain.model.User;

public interface RetrieveUserOutputPort {
    User retrieveUserById(Long id);
}
