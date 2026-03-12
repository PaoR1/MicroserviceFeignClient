package com.globant.feignclient.infrastructure.adapter.client;

import com.globant.feignclient.infrastructure.adapter.output.callapi.dto.response.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userClient", url = "${user.service.url}")
public interface UserClient {

    @GetMapping("/users/{id}")
    UserDto retrieveUserById(@PathVariable("id") Long id);
}
