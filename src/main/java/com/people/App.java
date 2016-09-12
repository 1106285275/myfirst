package com.people;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@SpringBootApplication(exclude = MybatisAutoConfiguration.class)
//@ImportResource("classpath:applicationContext-mybatis.xml")
@SpringBootApplication
@MapperScan
public class App {

  public static void main( String[] args )
  {
      SpringApplication.run(App.class, args);
  }
}
