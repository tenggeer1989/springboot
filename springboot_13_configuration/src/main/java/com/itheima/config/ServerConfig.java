package com.itheima.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * ClassName: ServletConfig
 * Package: com.itheima.config
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/23 - 18:57
 * Version:
 */

//@Component
@Data
@ConfigurationProperties(prefix = "servers")
public class ServerConfig {
    private String ipAddress;
    private int port;
    private long timeout;
    @DurationUnit(ChronoUnit.HOURS)
    private Duration serverTimeout;
}
