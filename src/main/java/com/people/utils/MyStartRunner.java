package com.people.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=1)//加执行顺序
public class MyStartRunner implements CommandLineRunner{

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("===================================");
		System.out.println("===================================");
		System.out.println("--------My Start Runner...");
		System.out.println("===================================");
	}

}
