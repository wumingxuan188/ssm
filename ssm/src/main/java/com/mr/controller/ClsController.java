package com.mr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mr.model.Cls;
import com.mr.service.ClsService;

@Controller
@RequestMapping("cls")
public class ClsController {

	@Autowired
	private ClsService clsService;
	
	//查询
	@ResponseBody
	@RequestMapping("queryCls")
	public List<Cls> queryCls(){
		 List<Cls> list = clsService.queryCls();
		 return list;
	}
}
