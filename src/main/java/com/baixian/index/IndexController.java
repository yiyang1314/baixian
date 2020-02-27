package com.baixian.index;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baixian.user.service.IItemcatService;
import com.baixian.user.service.IUserService;
import com.baixian.vo.BxItemcat;
import com.baixian.vo.BxUser;


@Controller

public class IndexController {
	@Autowired
	private IItemcatService itemcatService;
	
	@Autowired
	private IUserService iUserService;
	
	@RequestMapping("/index.do")
	private ModelAndView toIndex(ModelMap mode,HttpServletRequest requset){
		
		
		List<BxItemcat> list = itemcatService.findPage(null);
		 BxUser user = iUserService.findById(1);
		 Object obj= requset.getSession().getAttribute("user");
		 if(obj==null){
			 requset.getSession().setAttribute("user", user);
			 obj=user;
		 }
		 ModelAndView m = new ModelAndView("page/index1");
		 m.addObject("itemcatlist", list);
		 m.addObject("user", user);
		return m;
		
	}
}
