package com.itheima.utils;

import com.itheima.dao.BookDao;
import lombok.Data;
import lombok.ToString;

/**
 * ClassName: R
 * Package: com.itheima.utils
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/18 - 20:30
 * Version:
 */

@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(){}

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg){
        this.flag = false;
        this.msg = msg;
    }

}
