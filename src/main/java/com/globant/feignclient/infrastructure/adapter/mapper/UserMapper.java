package com.globant.feignclient.infrastructure.adapter.mapper;

import com.globant.feignclient.domain.model.User;
import com.globant.feignclient.infrastructure.adapter.output.callapi.dto.response.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserDto userDto);
}
