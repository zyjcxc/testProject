package com.meishu.admin;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jms.annotation.EnableJms;

/**
 * 启动类
 * 
 * @author mengqa
 *
 *         2017年4月18日
 */
@EnableJms
@SpringBootApplication
@MapperScan(basePackages = {"com.meishu.admin.server.dao", "com.meishu.admin.finger.dao"})
@Slf4j
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
