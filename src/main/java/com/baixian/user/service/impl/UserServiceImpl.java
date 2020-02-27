package com.baixian.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.baixian.common.respose.Result;
import com.baixian.common.respose.ResultCode;
import com.baixian.user.BxUserMapper;
import com.baixian.user.service.IUserService;

import com.baixian.vo.BxUser;
@Service("iUserService")
public class UserServiceImpl implements IUserService {
	private Logger log=LoggerFactory.getLogger(this.getClass());
	@Autowired
	private BxUserMapper  bxUserMapper;
	
	@Override
	public BxUser findOne(Map map) {
		
		return bxUserMapper.selectByExample(null).get(1);
	}

	@Override
	public List<BxUser> findPage(Map map) {
		
		return bxUserMapper.selectByExample(null);
	}

	@Override
	public BxUser findById( Integer id ) {
		id=1;
		log.debug("UserServiceImpl'findById----------28 line");
		return bxUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public Result update(BxUser record) {
		
		return null;
	}

	@Override
	public Result del(BxUser record) {
		
		return null;
	}

	@Override
	public Result save(BxUser record) {
		
		return null;
	}

	@Override
	public Result login(String username, String password) {
		Map map=new HashMap();
		map.put("username", username);
		map.put("password", password);
		BxUser user=bxUserMapper.login(map);
		Result  result=new Result();
		if(user==null){
			result.setCode(ResultCode.SUCCESS);
			result.setData(user);
			result.setMessage("登录成功");
		}else{
			result.setCode(ResultCode.FAIL);
			//result.setData(itemcat);
			result.setMessage("用户名或密码错误");
		}
		return result;

	}

}
