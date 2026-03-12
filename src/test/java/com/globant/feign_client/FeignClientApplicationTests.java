package com.globant.feign_client;

import com.globant.feignclient.FeignClientApplication;
import com.globant.feignclient.infrastructure.adapter.client.UserClient;
import com.globant.feignclient.infrastructure.adapter.output.callapi.dto.response.UserDto;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FeignClientApplication.class)
class FeignClientApplicationTests {

    @MockitoBean
    private UserClient userClient;

    @Test
    public void contextLoads() {
        // Define mock behavior if needed
        when(userClient.retrieveUserById(1L)).thenReturn(new UserDto(/* mock DTO */));

        // Your test logic
    }

}
