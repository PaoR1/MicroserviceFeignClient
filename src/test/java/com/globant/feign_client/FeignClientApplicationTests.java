package com.globant.feign.client; // Update package to match main app's package

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootTest(classes = FeignClientApplication.class) // Explicitly reference the main app class
@EnableFeignClients
class FeignClientApplicationTests {

    @Test
    public void contextLoads() {
        // Simplified test to ensure application context loads successfully
    }

}
