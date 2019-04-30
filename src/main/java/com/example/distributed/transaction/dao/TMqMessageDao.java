package com.example.distributed.transaction.dao;

import com.example.distributed.transaction.model.TMqMessage;
import com.example.distributed.transaction.model.TMqMessageExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TMqMessageDao {
    long countByExample(TMqMessageExample example);

    int deleteByExample(TMqMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TMqMessage record);

    int insertSelective(TMqMessage record);

    List<TMqMessage> selectByExampleWithBLOBs(TMqMessageExample example);

    List<TMqMessage> selectByExample(TMqMessageExample example);

    TMqMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TMqMessage record, @Param("example") TMqMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") TMqMessage record, @Param("example") TMqMessageExample example);

    int updateByExample(@Param("record") TMqMessage record, @Param("example") TMqMessageExample example);

    int updateByPrimaryKeySelective(TMqMessage record);

    int updateByPrimaryKeyWithBLOBs(TMqMessage record);

    int updateByPrimaryKey(TMqMessage record);
}