package com.core.superandsubclass;

public class SuperSubClassTest {
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		superClass.doSomething();
		
		SubClass subClass = new SubClass();
		subClass.doSomething();
		
		SubClass2 subClass2 = new SubClass2();
		subClass2.doSomething();
		
		SuperClass superClass1 = new SubClass();
		superClass1.doSomething();
		
		SuperClass superClass2 = new SubClass2();
		superClass2.doSomething();
	}

}

