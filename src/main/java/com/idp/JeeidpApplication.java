package com.idp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 
 * 启动类
 * @author taowd
 * @date 2019年4月19日
 * @see JeeidpApplication
 */
@SpringBootApplication
@EnableCaching // 缓存
// @EnableScheduling // 定时任务
public class JeeidpApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(JeeidpApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(JeeidpApplication.class);
	}
}
