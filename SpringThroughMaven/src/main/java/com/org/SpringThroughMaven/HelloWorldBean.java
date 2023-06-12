package com.org.SpringThroughMaven;

public class HelloWorldBean {
	
	private ByeWorldBean byeWorldBean;
	
	

	public HelloWorldBean(ByeWorldBean byeWorldBean) {
		super();
		this.byeWorldBean = byeWorldBean;
	}



	public void print() {
		System.out.println("Welcome To Technogeek");
		byeWorldBean.print();
	}

}
