package com.learning.StartUp.service;


import com.learning.StartUp.controller.HelloWorldController;
import com.learning.StartUp.repository.HelloWorldRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HelloWorldServiceTest {

    @Mock
    private HelloWorldRepository helloWorldRepository;

    @InjectMocks
    private HelloWorldService helloWorldService = new HelloWorldServiceImpl(helloWorldRepository);

    @Before
    public void setUp() {

    }

    @Test
    public void getHelloWorldTest() {
        Mockito.when(helloWorldRepository.getHelloWorld()).thenReturn("My Repo works and outputs Hello World");
        Assert.assertEquals(helloWorldService.getHelloWorldServiceImpl(),"My Repo works and outputs Hello World");
    }
}
