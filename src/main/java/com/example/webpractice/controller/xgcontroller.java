package com.example.webpractice.controller;
import com.example.webpractice.entity.stu;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
public class xgcontroller {
    @RequestMapping("/1")
    public String simpleParam(HttpServletRequest request) {
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        int age = Integer.parseInt(ageStr);
        System.out.println(name + ": " + age);
        return "OK";
    }
    @PostMapping("/2")
    public String test(stu st)
    {
        System.out.println(st);
        return "OOKK";
    }
    @RequestMapping("/3")
    public String simpleParam(String[] arr)
    {System.out.println(Arrays.toString(arr));
        return "OOKK";}
}
