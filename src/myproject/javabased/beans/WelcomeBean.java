package myproject.javabased.beans;

public class WelcomeBean {

	private String  name;
	
	static {
		System.out.println("WelcomeBean class Loading......");
	}
	
	public WelcomeBean() {
		System.out.println("WelcomeBean class Instantiation........");
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getWelcomeMessage() {
		
		return "Hello "+name+"!, Welcome to Spring Framework Java Based Bean Configuration";
	}
}
