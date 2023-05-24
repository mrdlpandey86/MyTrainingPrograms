package iteratorI;

import java.util.LinkedList;
import java.util.Iterator;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>cityNames= new LinkedList<String>();
		cityNames.add("Delhi");
		cityNames.add("Mumbai");
		cityNames.add("Pune");
		cityNames.add("Chennai");
		cityNames.add("Noida");

		Iterator iterator= cityNames.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
			}
	}


