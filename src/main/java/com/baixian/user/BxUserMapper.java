package com.baixian.user;

import java.util.Map;

import com.baixian.base.mapper.BaseMapper;

import com.baixian.vo.BxUser;
import com.baixian.vo.BxUserExample;


public interface BxUserMapper extends BaseMapper<BxUser,BxUserExample>{

	BxUser login(Map map);

}