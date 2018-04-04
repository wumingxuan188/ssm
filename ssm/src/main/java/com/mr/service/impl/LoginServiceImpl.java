package com.mr.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr.mapper.LoginMapper;
import com.mr.model.Login;
import com.mr.service.LoginService;
import com.mr.util.Json;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginMapper loginMapper;
	
	//登陆
	public Json queryByName(Login login) {
		Json json = new Json();
		Login login2 = loginMapper.queryByName(login.getLoginName());
		if(login2!=null) {
			if(login2.getLoginErrnum()<3) {
				if(login.getLoginPsw().equals(login2.getLoginPsw())) {
					login2.setLoginTime(new Date());
					login2.setLoginErrnum(0);
					json.setMsg("登陆成功");
					json.setObject(login2);
					loginMapper.updateByPrimaryKeySelective(login2);
				}else {
					json.setMsg("密码或者用户名错误");
					json.setState(1);
					json.setSuccess(false);
					Integer errnum = login2.getLoginErrnum();
					login2.setLoginErrnum(++errnum);
					if(login2.getLoginErrnum()==3) {
						login2.setLoginColdtime(new Date());
					}
					loginMapper.updateByPrimaryKeySelective(login2);
				}
			}else {
				json.setMsg("账号已冻结");
				json.setSuccess(false);
				json.setState(2);
			}
		}else {
			json.setMsg("用户不存在");
			json.setSuccess(false);
			json.setState(3);
		}
		
		return json;
	}
}
