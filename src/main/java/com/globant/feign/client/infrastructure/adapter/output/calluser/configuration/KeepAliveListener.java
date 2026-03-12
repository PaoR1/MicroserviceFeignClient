package com.globant.feign.client.infrastructure.adapter.output.calluser.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class KeepAliveListener {
    private static final Logger logger = LoggerFactory.getLogger(KeepAliveListener.class);

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        logger.info("✓ Application started and ready to serve requests");
        logger.info("✓ Feign Client is ready to make API calls");
    }
}
