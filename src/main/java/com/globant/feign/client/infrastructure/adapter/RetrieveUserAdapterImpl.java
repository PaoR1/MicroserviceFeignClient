package com.globant.feign.client.infrastructure.adapter;

import com.globant.feign.client.application.port.output.RetrieveUserOutputPort;
import com.globant.feign.client.domain.model.User;
import com.globant.feign.client.infrastructure.adapter.output.calluser.client.UserClient;
import com.globant.feign.client.infrastructure.adapter.mapper.UserMapper;
import com.globant.feign.client.infrastructure.adapter.output.calluser.dto.response.UserDto;
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
