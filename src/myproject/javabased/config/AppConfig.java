package myproject.javabased.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import myproject.javabased.beans.WelcomeBean;

@Configuration
public class AppConfig {

	@Bean
	public WelcomeBean welcomeBean() {
		return new WelcomeBean();
	}
}
