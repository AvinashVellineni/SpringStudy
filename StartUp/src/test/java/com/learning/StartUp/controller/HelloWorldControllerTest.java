package com.learning.StartUp.controller;

import com.learning.StartUp.service.HelloWorldService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {
    @Mock
    private HelloWorldService helloWorldService;

    @InjectMocks
    private HelloWorldController helloWorldController;

    @Before
    public void setUp() {

    }

    @Test
    public void getHelloWorldTest() {
        Mockito.when(helloWorldService.getHelloWorldServiceImpl()).thenReturn("My service works and outputs Hello World");
        Assert.assertEquals(helloWorldController.getHelloWorld(),"My service works and outputs Hello World");
    }
}
