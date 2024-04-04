package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public String helloWorld() {
        return "hello world!";
    }

    @GetMapping("/test")
    public List<Member> getAllMember() {
        List<Member> members = testService.getAllMembers();
        return members;
    }

}