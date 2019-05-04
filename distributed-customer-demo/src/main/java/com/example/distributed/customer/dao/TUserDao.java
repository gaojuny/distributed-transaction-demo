package com.example.distributed.customer.dao;

import com.example.distributed.customer.model.TUser;

import java.util.List;

import com.example.distributed.customer.model.TUserExample;
import org.apache.ibatis.annotations.Param;

public interface TUserDao {
    long countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    TUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}