package com.itheima.utils;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * ClassName: ProjectExceptionAdvice
 * Package: com.itheima.utils
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/19 - 23:23
 * Version:
 */

// 作为springmvc的异常处理器
// @ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {

    //拦截所有的异常信息
    @ExceptionHandler(Exception.class)
    public R doException(Exception ex){
        ex.printStackTrace();
        return new R("服务器故障，请稍后再试");
    }

}
