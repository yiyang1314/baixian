package com.baixian.user.service;


import com.baixian.base.mapper.IBaseService;
import com.baixian.common.respose.Result;
import com.baixian.vo.BxItemcat;
import com.baixian.vo.BxUser;

public interface IUserService  extends IBaseService<BxUser>{

	Result login(String username,String password);
	
	
	
	
	
}
