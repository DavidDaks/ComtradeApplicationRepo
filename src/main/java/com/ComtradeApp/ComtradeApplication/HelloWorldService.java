package com.ComtradeApp.ComtradeApplication;

import com.ComtradeApp.ComtradeApplication.model.HelloWorldModel;
import com.ComtradeApp.ComtradeApplication.repository.HelloWorldRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloWorldService {
    private final HelloWorldRepository helloWorldRepository;

    public HelloWorldService(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    public Optional<HelloWorldModel> getHelloWorldsById(Long index) {
        return helloWorldRepository.findById(index);
    }
}
