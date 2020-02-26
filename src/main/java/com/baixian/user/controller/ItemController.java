package com.baixian.user.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baixian.common.respose.Result;
import com.baixian.user.service.ItemcatIU;
import com.baixian.vo.BxItemcat;
@RestController
@RequestMapping("/itemcat")
public class ItemController {
	@Autowired
	private ItemcatIU itemcatService;
	
	
	@RequestMapping("/findOne")
	public BxItemcat findOne(Map map){
		
		return itemcatService.findOne(map);
		
	}
	
	@RequestMapping("/list")
	public List<BxItemcat> findPage(Map map){
		
		return itemcatService.findPage(map);
		
	}
	
	@RequestMapping("/findById")
	public BxItemcat findById(Integer id){
		
		return itemcatService.findById(id);
		
	}
	
	@RequestMapping("/update")
	public Result update(
			@RequestBody BxItemcat itemcat){
		Result result=itemcatService.update(itemcat);
		
		return  result;
		
	}
	
	@RequestMapping("/updateInfo")
	public BxItemcat updateInfo(Integer id){
		
		return itemcatService.findById(id);
		
	}
	
	
	
	@RequestMapping("/del")
	public Result del(@RequestBody BxItemcat itemcat){
		
		
		return itemcatService.del(itemcat);
		
	}
	
	@RequestMapping("/save")
	public Result save(@RequestBody BxItemcat itemcat){
		
		return  itemcatService.save(itemcat);
	}
	
	
	
	
}
