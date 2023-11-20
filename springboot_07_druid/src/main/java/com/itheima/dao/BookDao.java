package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
public interface BookDao {

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
}
