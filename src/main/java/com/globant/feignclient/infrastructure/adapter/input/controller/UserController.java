package com.globant.feignclient.infrastructure.adapter.input.controller;

import com.globant.feignclient.application.port.input.RetrieveUserInputPort;
import com.globant.feignclient.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private RetrieveUserInputPort retrieveUserInputPort;

    @GetMapping("/test/{id}")
    public User getUsuario(@PathVariable("id") Long id) {
        return retrieveUserInputPort.retrieveUserById(id);
    }
}