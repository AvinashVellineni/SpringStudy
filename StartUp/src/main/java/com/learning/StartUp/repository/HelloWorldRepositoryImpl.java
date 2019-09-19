package com.learning.StartUp.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepositoryImpl implements HelloWorldRepository{
    public HelloWorldRepositoryImpl() {

    }

    public String getHelloWorld() {
        return "This is hello World Repo";
    }
}
