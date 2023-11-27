package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ClassName: BookDao
 * Package: com.itheima.dao
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/17 - 0:24
 * Version:
 */

@Mapper
public interface BookDao extends BaseMapper<Book> {

    // @Select("select * from tbl_book where id = #{id}")
    // Book getById(Integer id);

}
