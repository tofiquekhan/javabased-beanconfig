package myproject.javabased.beans;

public class HelloBean {

	private String name;
	
	static {
		System.out.println("HelloBean class loading.....");
	}
	
	public HelloBean() {
		System.out.println("HelloBean class instantiation.........");
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String sayHello() {
		return "Hello "+name+"!, Good Morning!";
	}
}
