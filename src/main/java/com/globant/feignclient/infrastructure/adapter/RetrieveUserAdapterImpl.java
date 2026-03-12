package com.globant.feignclient.infrastructure.adapter;

import com.globant.feignclient.application.port.output.RetrieveUserOutputPort;
import com.globant.feignclient.domain.model.User;
import com.globant.feignclient.infrastructure.adapter.client.UserClient;
import com.globant.feignclient.infrastructure.adapter.mapper.UserMapper;
import com.globant.feignclient.infrastructure.adapter.output.callapi.dto.response.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RetrieveUserAdapterImpl implements RetrieveUserOutputPort {

    @Autowired private UserClient client;
    @Autowired private UserMapper userMapper;

    @Override
    public User retrieveUserById(Long id) {
        UserDto userDto = client.retrieveUserById(id);
        return userMapper.toUser(userDto);
    }
}
