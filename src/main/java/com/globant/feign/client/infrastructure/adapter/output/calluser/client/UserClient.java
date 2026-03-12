package com.globant.feign.client.infrastructure.adapter.output.calluser.client;

import com.globant.feign.client.infrastructure.adapter.output.calluser.configuration.UserClientConfiguration;
import com.globant.feign.client.infrastructure.adapter.output.calluser.dto.response.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userClientFeign", url = "${user.service.url}", configuration = UserClientConfiguration.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    UserDto retrieveUserById(@PathVariable("id") Long id);
}
