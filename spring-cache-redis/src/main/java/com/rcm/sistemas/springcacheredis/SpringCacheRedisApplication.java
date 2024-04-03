package com.rcm.sistemas.springcacheredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class SpringCacheRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCacheRedisApplication.class, args);
	}

}

//## https://www.youtube.com/watch?v=3j6erwYfisM&list=PL0D5C4QG6iBpTgwkzmGfp68hcKm8AER8s&index=7