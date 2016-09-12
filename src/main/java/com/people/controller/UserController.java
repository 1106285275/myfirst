package com.people.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.people.entity.Shanhy;
import com.people.entity.User;
import com.people.service.UserService;

//@ComponentScan(basePackages={"com.people"})
//@ImportResource(locations={"classpath:application-bean.xml"})
//@Configuration
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
	
	@Resource(name = "shanhyA")
	private Shanhy shanhyA;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/{id}")
	public User getUser(@PathVariable String id){
		User user = userService.getUser(id);
		return user;
	}
	
	@RequestMapping("/")
	public void welcome(){
		System.out.println("===========Welcom!!!!!!!==============");
		shanhyA.display();
	}
	/*@RequestMapping("/{id}")
    public User getUser(@PathVariable String id){
        User user  = new User();
        user.setId(id);
        user.setUsername("id==="+Math.random());
        return user;
    }*/
}
