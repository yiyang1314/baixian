package com.baixian.base.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.context.annotation.Condition;

import com.baixian.common.respose.Result;
import com.baixian.vo.BxItemcat;

public interface IBaseService<T> {

	public T findOne(Map map);
	
	public List<T> findPage(Map map);
	
	public T findById(Integer id);
	
	
	public Result update(T record);
	
	
	public Result del(T record);
	
	public Result save(T record);

}
