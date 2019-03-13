package com.store.lucky.user.dao;

import com.github.pagehelper.Page;
import com.store.lucky.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long uuid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long uuid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);

    /**
     * 查询用户信息
     *
     * @return
     */
    List<User> selectAll();

    /**
     * 分页获取用户信息
     *
     * @return
     */
    Page<User> findByPage();
}