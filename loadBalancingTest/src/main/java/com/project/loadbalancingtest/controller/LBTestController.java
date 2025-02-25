package com.project.loadbalancingtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class LBTestController {

    @GetMapping("/test/second")
    public String mainP(){

        return "로드밸런싱 테스트2페이지입니다.";
    }
}
