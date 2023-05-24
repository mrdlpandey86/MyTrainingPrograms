package com.org.ListInterface;
import java .util.LinkedList;
import java.util.List;
public class App {
	
	//static LinkedList<String> playersName= new LinkedList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>playersName= new LinkedList();
		
   playersName.add("Arun");
   playersName.add("Babli");
   playersName.add("Harshit");
   playersName.add("Naira");
   playersName.add("Mridula");
   playersName.add("Aaru");
   playersName.add("Nayu");
	
   App app = new App();
   
   app. displayNames(playersName);
   
	}
	
	void displayNames(List playersName) {
		for( Object name: playersName) {
			System.out.println(name);
		}
			
		}
	}
	


