package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MsgConfig
 * Package: com.itheima.config
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/23 - 21:19
 * Version:
 */

@Configuration
public class MsgConfig {

    @Bean
    public String msg(){
        return "bean msg";
    }
}
