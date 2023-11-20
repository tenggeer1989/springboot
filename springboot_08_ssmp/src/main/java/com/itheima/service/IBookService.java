package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

/**
 * ClassName: IBookService
 * Package: com.itheima.service
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/18 - 0:41
 * Version:
 */
public interface IBookService extends IService<Book> {

    IPage<Book> getPage(int currentPage, int pageSize);
}
