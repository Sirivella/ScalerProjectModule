package com.scaler.projectmodule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/hello/{id}")
    public String sayHello(@PathVariable("id") String id) {
        return "Hello World, this is "+id;
    }
}
