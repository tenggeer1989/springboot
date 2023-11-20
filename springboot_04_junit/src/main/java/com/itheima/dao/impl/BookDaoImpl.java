package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * ClassName: BookDaoImpl
 * Package: com.itheima.dao.impl
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/16 - 20:15
 * Version:
 */

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao is running...");
    }
}
