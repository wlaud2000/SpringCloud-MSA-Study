package com.project.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {

    @GetMapping("/test/first")
    public String mainP(){

        return "테스트페이지1";
    }
}
