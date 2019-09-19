package com.learning.StartUp.service;

import com.learning.StartUp.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{

    private HelloWorldRepository helloWorldRepository;

    public HelloWorldServiceImpl(HelloWorldRepository helloWorldRepository){
        this.helloWorldRepository = helloWorldRepository;
    }

    public String getHelloWorldServiceImpl() {
        return this.helloWorldRepository.getHelloWorld();
    }
}
