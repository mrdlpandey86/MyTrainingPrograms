package com.core.ListI;

import java.util.ArrayList;
import java.util.List;

public class App {

	List<String> playersName = new ArrayList<>();

	public static void main(String[] args) {
		// adding an element
		App app = new App();
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

		app.displayNames();
	}

	void displayNames() {
		for (String name : playersName) {
			System.out.println(name);
		}

	}
}
