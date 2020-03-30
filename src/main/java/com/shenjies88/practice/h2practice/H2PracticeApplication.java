package com.shenjies88.practice.h2practice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
@MapperScan("com.shenjies88.practice.h2practice")
@SpringBootApplication
public class H2PracticeApplication {

	@Autowired
	private UserMapper userMapper;

	public static void main(String[] args) {
		SpringApplication.run(H2PracticeApplication.class, args);
	}

	@GetMapping("/list")
	public List<UserDo> userList() {
		return userMapper.userList();
	}

}
