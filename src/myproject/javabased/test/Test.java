package myproject.javabased.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import myproject.javabased.beans.WelcomeBean;
import myproject.javabased.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WelcomeBean welcomeBean1 = (WelcomeBean) context.getBean("welcomeBean");
		System.out.println(welcomeBean1.getWelcomeMessage());
		WelcomeBean welcomeBean2 = (WelcomeBean) context.getBean(WelcomeBean.class);
		System.out.println(welcomeBean2.getWelcomeMessage());
	}
}
