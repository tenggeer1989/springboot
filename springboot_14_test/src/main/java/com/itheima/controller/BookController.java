package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: BookController
 * Package: com.itheima.controller
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/23 - 21:50
 * Version:
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("getById is running....");
        return "springboot";
    }
}
