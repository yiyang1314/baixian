package com.baixian.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baixian.common.respose.Result;
import com.baixian.common.respose.ResultCode;
import com.baixian.user.BxItemcatMapper;
import com.baixian.user.service.ItemcatIU;
import com.baixian.vo.BxItemcat;
import com.baixian.vo.BxItemcatExample;
import com.baixian.vo.BxItemcatExample.Criteria;


@Service("itemcatService")
public class ItemcatServiceImpl implements ItemcatIU {

	@Autowired
	private BxItemcatMapper bxItemcatMapper;
	
	@Override
	public BxItemcat findOne(Map map) {
		
		return bxItemcatMapper.selectByPrimaryKey(2);
	}

	@Override
	public List<BxItemcat> findPage(Map map) {
		
		BxItemcatExample example=new BxItemcatExample();
		Criteria connd=example.createCriteria();
		connd.andParentidEqualTo(0);
		return bxItemcatMapper.selectByExample(example);
	}

	@Override
	public BxItemcat findById(Integer id) {
		
		return bxItemcatMapper.selectByPrimaryKey(id);
	}

	@Override
	public Result update(BxItemcat itemcat) {
		int n=bxItemcatMapper.updateByPrimaryKey(itemcat);
		Result  result=new Result();
		if(n>0){
			result.setCode(ResultCode.SUCCESS);
			result.setData(itemcat);
			result.setMessage("修改成功！");
		}else{
			result.setCode(ResultCode.FAIL);
			result.setData(itemcat);
			result.setMessage("修改成功！");
		}
		return result;
	}

	@Override
	public Result del(BxItemcat itemcat) {
		BxItemcatExample example=null;
		int n=bxItemcatMapper.deleteByExample(example);
		Result  result=new Result();
		if(n>0){
			result.setCode(ResultCode.SUCCESS);
			result.setData(itemcat);
			result.setMessage("删除成功！");
		}else{
			result.setCode(ResultCode.FAIL);
			result.setData(itemcat);
			result.setMessage("删除成功！");
		}
		return result;
	}

	@Override
	public Result save(BxItemcat itemcat) {
		int n=bxItemcatMapper.insertSelective(itemcat);
		Result  result=new Result();
		if(n>0){
			result.setCode(ResultCode.SUCCESS);
			result.setData(itemcat);
			result.setMessage("添加成功！");
		}else{
			result.setCode(ResultCode.FAIL);
			result.setData(itemcat);
			result.setMessage("添加成功！");
		}
		return result;
	}

}
