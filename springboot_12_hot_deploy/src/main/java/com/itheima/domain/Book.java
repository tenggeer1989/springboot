package com.itheima.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Book
 * Package: com.itheima.domain
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/17 - 0:16
 * Version:
 */

@Data
public class Book {

    private Integer id;
    private String type;
    private String name;
    private String description;
}
