package com.store.lucky.user.dao;

import com.store.lucky.user.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long uuid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long uuid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);
}