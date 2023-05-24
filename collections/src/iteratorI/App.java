package iteratorI;
import java.util.Iterator;
import java.util.ArrayList;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Iterator<String>it= new ArrayList<>();
ArrayList<String>cityNames= new ArrayList<String>();
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
