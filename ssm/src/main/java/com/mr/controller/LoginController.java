package com.mr.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mr.model.Login;
import com.mr.service.LoginService;
import com.mr.util.Json;

@Controller
@RequestMapping("login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@ResponseBody
	@RequestMapping("login1")
	public Json login(Login login,HttpSession session) {
		Json json = loginService.queryByName(login);
		session.setAttribute("loginer", json.getObject());
		return json;
	}
}
