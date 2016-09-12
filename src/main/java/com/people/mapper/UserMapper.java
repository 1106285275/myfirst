package com.people.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.people.entity.User;

public interface UserMapper {
	 public User findUserInfo(String id);
}
