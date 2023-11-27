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
 * @Create: 2023/11/22 - 19:04
 * Version:
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("springboot is running..");
        return "springboot is running....";
    }
}
