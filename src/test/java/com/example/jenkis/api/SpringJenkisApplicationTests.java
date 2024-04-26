package com.example.jenkis.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkisApplicationTests {

    static Logger logger = LoggerFactory.getLogger(SpringJenkisApplication.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
    }

}
