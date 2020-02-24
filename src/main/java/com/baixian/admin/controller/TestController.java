package com.baixian.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baixian.dao.TEmpMapper;
import com.baixian.dao.TStudentMapper;
import com.baixian.vo.TEmp;
import com.baixian.vo.TStudent;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TEmpMapper tEmpMapper;
	
	

	@Autowired
	private TStudentMapper tStudentMapper;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TEmp> findAll(){			
		return tEmpMapper.selectByExample(null);
	}
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findlist")
	@ResponseBody
	public List<TEmp> findlist(){			
		return tEmpMapper.selectByExample(null);
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<TStudent> list(){			
		return tStudentMapper.selectByExample(null);
	}
	
}
