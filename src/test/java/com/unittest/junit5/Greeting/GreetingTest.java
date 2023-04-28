package com.unittest.junit5.Greeting;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
class GreetingTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingTest.class);
    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        LOGGER.info("Before - I am only called once.....");
    }

    @BeforeEach
    void setUp() {
        LOGGER.info("In before each......");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        LOGGER.info(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        LOGGER.info(greeting.helloWorld("Dhaval"));
    }

    @AfterEach
    void tearDown() {
        LOGGER.info("In After Each.....");
    }

    @AfterAll
    public static void afterClass() {
        LOGGER.info("After - I am only called once.....");
    }
}