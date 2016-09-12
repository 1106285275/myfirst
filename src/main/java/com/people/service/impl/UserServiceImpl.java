package com.people.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.people.dao.UserDao;
import com.people.entity.User;
import com.people.mapper.UserMapper;
import com.people.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUser(String id) {
		//return userDao.getUser(id);
		return userMapper.findUserInfo(id);
	}

}
