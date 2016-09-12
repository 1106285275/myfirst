package com.people.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.people.dao.UserDao;
import com.people.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

/*	public User getUser() {
		User user = new User();
		user.setId("test");
		user.setUsername("lml0068");
		return user;
	}*/

	public User getUser(String id) {
		String sql = "select * from user where id=?";
	    RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
	    return (User)jdbcTemplate.queryForObject(sql, rowMapper,id);
	}
	
}
