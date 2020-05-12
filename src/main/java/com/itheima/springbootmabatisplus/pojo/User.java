package com.itheima.springbootmabatisplus.pojo;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class User {
    private Long id;// 主键

    private String name;// 姓名

    private Integer age;// 年龄

    private String email;// 邮箱

    private Long managerId;// 直属上级

    private LocalDateTime createTime;// 创建实际
}
