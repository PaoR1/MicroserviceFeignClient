package com.globant.feign.client.infrastructure.adapter.input.controller;

import com.globant.feign.client.application.port.input.RetrieveUserInputPort;
import com.globant.feign.client.domain.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/test")
public class UserController {

    @Autowired
    private RetrieveUserInputPort retrieveUserInputPort;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUsuario(@PathVariable("id") Long id) {
        User response = retrieveUserInputPort.retrieveUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}