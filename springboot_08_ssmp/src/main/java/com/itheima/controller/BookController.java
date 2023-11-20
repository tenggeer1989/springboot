package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import com.itheima.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


/**
 * ClassName: BookController
 * Package: com.itheima.controller
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/18 - 19:22
 * Version:
 */

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll(){
        return new R(true,bookService.list());
    }

    @PostMapping
    // @RequestBody JSONデータを送信する
    public R save(@RequestBody Book book) throws IOException {
        if (book.getName().equals("123")) throw new IOException();
        boolean flag = bookService.save(book);
        return new R(flag,flag ? "添加成功^_^":"添加失败-_-!");
    }

    @PutMapping
    // @RequestBody JSONデータを送信する
    public R update(@RequestBody Book book){
        return new R(bookService.updateById(book));
    }

    @DeleteMapping("{id}")
    // @PathVariable  パスパラメータを送信する
    public R delete(@PathVariable Integer id){
        return new R(bookService.removeById(id));
    }

    @GetMapping("{id}")
    // パスパラメータを送信する
    public R getById(@PathVariable Integer id) {
        return new R(true,bookService.getById(id));

    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        IPage<Book> page = bookService.getPage(currentPage, pageSize);
        // もし現在のページ番号が総ページ数を超えている場合は、再度検索操作を実行し、最大ページ番号を現在のページ番号として使用する
        if(currentPage > page.getPages()){
            page = bookService.getPage((int)page.getPages(), pageSize);
        }
        return new R(true,page);
    }



}
