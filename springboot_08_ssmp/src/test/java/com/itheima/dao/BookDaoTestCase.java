package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: BookDaoTestCase
 * Package: com.itheima.dao
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/17 - 0:37
 * Version:
 */

@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;

    @Test
    void testById() {
        System.out.println(bookDao.selectById(2));
    }

    @Test
    void testSave(){
        Book book  = new Book();
        book.setType("测试数据asdfasdfas");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate(){
        Book book  = new Book();
        book.setId(15);
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.updateById(book);
    }

    @Test
    void testDelete(){
        bookDao.deleteById(15);
    }

    @Test
    void testGetAll(){
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetPage(){
        IPage page = new Page(2,5);
        bookDao.selectPage(page,null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","spring");
        bookDao.selectList(qw);
    }

    @Test
    void testGetBy2(){
        String name = "5";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(name != null,Book::getName,name);
        bookDao.selectList(lqw);

    }

    @Test
    void testGetBy3(){

    }
}
