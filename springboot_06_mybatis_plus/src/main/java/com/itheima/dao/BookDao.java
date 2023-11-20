package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: BookDao
 * Package: com.itheima.dao
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/16 - 20:40
 * Version:
 */

@Mapper
public interface BookDao extends BaseMapper<Book> {



}
