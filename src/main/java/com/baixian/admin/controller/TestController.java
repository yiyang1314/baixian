package com.baixian.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baixian.user.BxAdminMapper;
import com.baixian.vo.BxAdmin;
import com.baixian.vo.BxAdminExample;
import com.baixian.vo.BxAdminExample.Criteria;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private BxAdminMapper bxAdminMapper;
	
	

	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<BxAdmin> findAll(){			
		return bxAdminMapper.selectByExample(null);
	}
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findlist")
	@ResponseBody
	public List<BxAdmin> findlist(){			
		return bxAdminMapper.selectByExample(null);
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findlist1")
	@ResponseBody
	public List<BxAdmin> findlist1(){			
		//创建条件构造器的实例
		BxAdminExample example=new BxAdminExample();
		//创建
		Criteria criteria = example.createCriteria();
		
		//拼接条件
		criteria.andAdminNameLike("%ad%");//name like '%ad%'
		
		criteria.andPasswordEqualTo("123456");//password='123456'
		
		criteria.andIdLessThan(16);//id <16
		
		
		return bxAdminMapper.selectByExample(example);
	}
	
	
}
