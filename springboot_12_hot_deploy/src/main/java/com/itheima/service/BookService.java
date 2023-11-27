package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;

import java.util.List;

/**
 * ClassName: BookService
 * Package: com.itheima.service
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/17 - 23:51
 * Version:
 */
public interface BookService {

    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage,int pageSize);
}
