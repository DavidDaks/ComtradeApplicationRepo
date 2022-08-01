package com.ComtradeApp.ComtradeApplication;

import com.ComtradeApp.ComtradeApplication.model.HelloWorldModel;
import com.ComtradeApp.ComtradeApplication.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping(value="/hello/{itemId}")
    public ModelAndView HelloWorld(@PathVariable Long itemId)
    {
        ModelAndView mav = new ModelAndView("HelloWorld");
        mav.addObject("helloWorldItem", helloWorldService.getHelloWorldsById(itemId).get());
        return mav;
    }



}
