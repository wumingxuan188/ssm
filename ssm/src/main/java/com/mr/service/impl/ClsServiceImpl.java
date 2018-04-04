package com.mr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr.mapper.ClsMapper;
import com.mr.model.Cls;
import com.mr.service.ClsService;

@Service
public class ClsServiceImpl implements ClsService {

	@Autowired
	private ClsMapper clsMapper;
	
	//查询
	public List<Cls> queryCls(){
	return 	clsMapper.selectByExample(null);
	}
}
