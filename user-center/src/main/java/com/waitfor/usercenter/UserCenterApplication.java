package com.waitfor.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import tk.mybatis.spring.annotation.MapperScan;
// 扫描mybatis哪些包里面的接口
@MapperScan("com.waitfor")
@SpringBootApplication
//@EnableDiscoveryClient
@EnableBinding(Sink.class)
public class UserCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCenterApplication.class, args);
	}

}
