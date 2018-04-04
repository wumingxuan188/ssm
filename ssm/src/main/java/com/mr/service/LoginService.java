package com.mr.service;

import com.mr.model.Login;
import com.mr.util.Json;

public interface LoginService {

	public Json queryByName(Login login);
}
