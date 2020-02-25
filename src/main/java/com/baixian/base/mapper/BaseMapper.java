package com.baixian.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;



public interface BaseMapper<T> {

    int countByExample(T example);

    int deleteByExample(T example);

    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(T example);

    T selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") T example);

    int updateByExample(@Param("record") T record, @Param("example") T example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

}
