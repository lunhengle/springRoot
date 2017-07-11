package com.lhl.springRoot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * helloWorld.
 * Created by lunhengle on 2017/7/10.
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {
    @RequestMapping("/")
    String home() {
        return "hello world!";
    }

    @RequestMapping("/home/{myName}")
    String index(@PathVariable String myName) {
        return "hello " + myName + "!!!";
    }
}
