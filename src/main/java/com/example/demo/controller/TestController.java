package com.example.demo.controller;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/add")
    public String add(){
        Test test=new Test();
        test.setId(UUID.randomUUID().toString());
        test.setValue("插入测试");
        test.setComment("插入测试");
        try {
            testService.insert(test);
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @RequestMapping("/remove")
    public String remove(){
        Test test=new Test();
        test.setId("1b2c3d4e");
        try {
            testService.delete(test);
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }
}

