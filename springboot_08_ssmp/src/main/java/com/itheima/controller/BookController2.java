package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: BookController
 * Package: com.itheima.controller
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/18 - 19:22
 * Version:
 */

//@RestController
@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.list();
    }

    @PostMapping
    // @RequestBody JSONデータを送信する
    public Boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping
    // @RequestBody JSONデータを送信する
    public Boolean update(@RequestBody Book book){
        return bookService.updateById(book);
    }

    @DeleteMapping("{id}")
    // @PathVariable  パスパラメータを送信する
    public Boolean delete(@PathVariable Integer id){
        return bookService.removeById(id);
    }

    @GetMapping("{id}")
    // パスパラメータを送信する
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);

    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return bookService.getPage(currentPage,pageSize,null);
    }



}
