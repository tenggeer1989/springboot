package com.itheima.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: BookServiceTestCase
 * Package: com.itheima.service
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/17 - 23:59
 * Version:
 */

@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private BookService bookService;

    @Test
    void testGetById(){
        System.out.println(bookService.getById(3));
    }

    @Test
    void testSave(){
        Book book  = new Book();
        book.setType("小说");
        book.setName("三国演义");
        book.setDescription("魏蜀吴三国故事");
        bookService.save(book);
    }

    @Test
    void testUpdate(){
        Book book  = new Book();
        book.setId(16);
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.update(book);
    }

    @Test
    void testDelete(){
        bookService.delete(16);
    }

    @Test
    void testGetAll(){
        System.out.println(bookService.getAll());
    }

    @Test
    void testGetPage(){
        IPage<Book> page = bookService.getPage(3, 5);
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getSize());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());

    }
    //
    // @Test
    // void testGetBy(){
    //     QueryWrapper<Book> qw = new QueryWrapper<>();
    //     qw.like("name","spring");
    //     bookService.selectList(qw);
    // }
    //
    // @Test
    // void testGetBy2(){
    //     String name = "5";
    //     LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
    //     lqw.like(name != null,Book::getName,name);
    //     bookService.selectList(lqw);
    //
    // }
}
