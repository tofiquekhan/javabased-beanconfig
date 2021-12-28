package myproject.javabased.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import myproject.javabased.beans.WelcomeBean;
import myproject.javabased.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WelcomeBean welcomeBean = (WelcomeBean) context.getBean("welcomeBean");
		System.out.println(welcomeBean.getWelcomeMessage());
	}
}
