package com.org.autoboxingunboxing;
import java.util.ArrayList;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	ArrayList<Integer> values= new ArrayList<>();
	
     values.add(23);  //Autoboxing    
     values.add(Integer.valueOf(56));
     
     System.out.println(values);
     System.out.println(values.get(0));//unboxing
}
}