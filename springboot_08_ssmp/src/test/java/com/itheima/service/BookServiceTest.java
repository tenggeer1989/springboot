package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: BookServiceTest
 * Package: com.itheima.service
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/18 - 0:43
 * Version:
 */
@SpringBootTest
public class BookServiceTest {

    @Autowired
    private IBookService bookService;

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
        book.setId(17);
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.updateById(book);
    }

    @Test
    void testDelete(){
        bookService.removeById(17);
    }

    @Test
    void testGetAll(){
        System.out.println(bookService.list());
    }

    @Test
    void testGetPage(){
        IPage page = new Page<Book>(2,5);
        IPage<Book> page1 = bookService.page(page);
        System.out.println(page1.getPages());
        System.out.println(page1.getTotal());
        System.out.println(page1.getSize());
        System.out.println(page1.getCurrent());
        System.out.println(page1.getRecords());

    }
}
