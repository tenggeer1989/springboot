package com.itheima;

import com.itheima.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

/**
 * ClassName: ConfigurationTest
 * Package: com.itheima
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/23 - 21:22
 * Version:
 */
@SpringBootTest
@Import({MsgConfig.class})
public class ConfigurationTest {
    @Autowired
    private String msg;

    @Test
    void testConfiguration(){
        System.out.println(msg );
    }
}
