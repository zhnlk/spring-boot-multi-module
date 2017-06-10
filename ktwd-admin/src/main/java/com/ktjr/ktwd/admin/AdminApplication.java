package com.ktjr.ktwd.admin;

import com.ktjr.ktwd.core.CoreApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AdminApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
			.bannerMode(Banner.Mode.CONSOLE)
			.sources(CoreApplication.class, AdminApplication.class)
			.run(args);
	}

}