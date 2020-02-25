package com.baixian.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baixian.dao.BxAdminMapper;
import com.baixian.vo.BxAdmin;


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
	
}
