package com.baixian.test.mappers;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baixian.common.respose.Result;
import com.baixian.user.BxUserMapper;
import com.baixian.user.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-*.xml"})
public class TestCase {
	private Logger log=Logger.getLogger(getClass());
	@Autowired
	private IUserService iUserService;
	
	
	@Autowired
	private BxUserMapper bxUserMapper;
	
	@Test
	public void testLogin(){
		//Result rs = iUserService.login("yiyang", "123");
		Map map=new HashMap();
		map.put("username", "yiyang");
		map.put("password", "123");
		System.out.println(bxUserMapper.login(map));
		//log.debug(rs.getMessage()+"----"+rs.getCode());
	}
	
	
}
