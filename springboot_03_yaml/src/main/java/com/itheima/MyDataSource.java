package com.itheima;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyDataSource
 * Package: com.itheima
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/16 - 19:50
 * Version:
 */

// 1.データモデルを定義してYAMLファイルに対応するデータをカプセル化する
// 2.Springが管理するBeanとして定義する
@Component
@ConfigurationProperties(prefix = "datasource")
public class MyDataSource {

    private String driver;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "MyDataSource{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
