package com.itheima.springbootmabatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.springbootmabatisplus.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
