package com.org.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App1 {

	List<String> playersName = new ArrayList<>();

	public static void main(String[] args) {
		// adding an element
		App1 app = new App1();
		app.playersName.add("H");
		app.playersName.add("I");
		app.playersName.add("G");
		app.playersName.add("O");
		app.playersName.add("P");
		app.playersName.add("Q");
		app.playersName.add("U");
		app.playersName.add("E");
		app.playersName.add("R");
		app.playersName.add("S");

		// remove element by name
		app.removeElementsByName("O");
		
		// remove element by position
		app.removeElementsByIndex(5);
	
		
		app.displayNames();
		
		//check element exist or not
		System.out.println("**************************************************");
		int index = app.searchElement("E");
		System.out.println(index);
		if(index<0) {
			System.out.println("element does not exist in the array list");}
			else {
			app.updateElement(index," W");	
			app.displayNames();
		}
		
		
	}

	void displayNames() {
		for (String name : playersName) {
			System.out.println(name);
		}

	}

	void removeElementsByName(String name) {
		playersName.remove(name);
	}

	void removeElementsByIndex(int position) {
		playersName.remove(position);
	}
int searchElement(String name) {
	return playersName.indexOf(name);
	
}
void updateElement(int position,String newName) {
	playersName .set(position, newName);
}


}
