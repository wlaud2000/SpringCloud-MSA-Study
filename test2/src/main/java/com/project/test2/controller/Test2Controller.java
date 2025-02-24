package com.project.test2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Test2Controller {

    @GetMapping("/test/second")
    public String mainP(){

        return "테스트2페이지입니다.";
    }
}
