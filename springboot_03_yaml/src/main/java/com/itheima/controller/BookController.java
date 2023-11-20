package com.itheima.controller;

import com.itheima.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    private String country1;

    @Value("${users.name}")
    private String name1;
    @Value("${users.age}")
    private String age1;
    @Value("${likes[1]}")
    private String likes1;
    @Value("${tempDir}")
    private String tempDir;

    // Autowiredを通してすべてのデータをEnvironmentオブジェクトにカプセル化する
    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById(){
        System.out.println("springboot is running...2");
        System.out.println("country1 =====>" + country1);
        System.out.println("name1 =====>" + name1);
        System.out.println("age1 =====>" + age1);
        System.out.println("likes1 =====>" + likes1);
        System.out.println("tempDir =====>" + tempDir);
        System.out.println("=============================");
        System.out.println(env.getProperty("server.port"));
        System.out.println(env.getProperty("users.name"));
        System.out.println("=============================");
        System.out.println(myDataSource);
        return "springboot is running...2";
    }

}
