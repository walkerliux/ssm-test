package com.paytong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paytong.mapper.TUserMapper;
import com.paytong.pojo.TUser;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private TUserMapper tUserMapper;
	
	public void selectUser() {
		TUser user = tUserMapper.selectByPrimaryKey(1);
		System.out.println(user.getUserName());
	}

	public void insertUser() {
		

	}

}
