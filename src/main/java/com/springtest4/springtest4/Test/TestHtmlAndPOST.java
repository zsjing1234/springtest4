package com.springtest4.springtest4.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

//测试
@RestController
@RequestMapping("/test2")
public class TestHtmlAndPOST {

    @PostMapping("/test3")
    public String test1(@RequestBody Map<String, String> map){
        System.out.println("test"+map.get("mun"));
        return "test";
    }
}
