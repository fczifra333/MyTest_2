/*
 * Author:  Ferenc Czifra
 * Created: 2019.04.08
 */

package com.tsystems.gslacloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Application class
 */
@EnableAsync
@EnableScheduling
@EnableConfigurationProperties
@SpringBootApplication          // @Configuration + @EnableAutoConfiguration + @ComponentScan
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        // Initialize the Spring Boot application!
        SpringApplication.run(Application.class, args);

        LOGGER.debug("main(): ENTRY:");
        LOGGER.debug("main(): ============================================================");
        LOGGER.trace("TRACE log level is ON");
        LOGGER.debug("DEBUG log level is ON");
        LOGGER.info ("INFO  log level is ON");
        LOGGER.warn ("WARN  log level is ON");
        LOGGER.error("ERROR log level is ON");
        LOGGER.debug("main(): ============================================================");

        LOGGER.warn("!!!!! Run the ApplicationTest instead of the Application !!!!! ");
        LOGGER.warn("or");
        LOGGER.warn("!!!!! Turn on the scheduling in 'RfuStreamProducer.java' by removing the commin before @Scheduled ... !!!!!");

        LOGGER.debug("main(): ============================================================");
        LOGGER.debug("main(): EXIT:");
    }
}
