package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper{
    public List<User> selectUser();

    public User selByName(@Param("username") String uname);
}
