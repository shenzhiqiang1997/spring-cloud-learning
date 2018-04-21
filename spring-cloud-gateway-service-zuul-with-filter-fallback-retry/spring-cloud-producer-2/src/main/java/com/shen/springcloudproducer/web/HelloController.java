package com.shen.springcloudproducer.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name) throws InterruptedException {
        System.out.println(name);
        Thread.sleep(1000);
        return "hello "+name+", this is second message";
    }
}
