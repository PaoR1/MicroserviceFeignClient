package com.globant.feign.client.infrastructure.adapter.mapper;

import com.globant.feign.client.domain.model.User;
import com.globant.feign.client.infrastructure.adapter.output.calluser.dto.response.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserDto userDto);
}
