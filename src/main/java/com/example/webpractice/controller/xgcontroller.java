package com.example.webpractice.controller;
import com.example.webpractice.entity.stu;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


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
    @RequestMapping("/4")
    public String simpleParam1(@RequestParam List<String> lis)
    {System.out.println(lis);
        return "OOKK";}
    @RequestMapping("/5")
    public String json(@RequestBody stu st)
    {System.out.println(st);
        return "OOKK";}
}
