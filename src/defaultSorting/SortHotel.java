package defaultSorting;

import java.util.TreeSet;

public class SortHotel {
public static void main(String[] args) {
	Hotel h1 = new Hotel("Taj", 4.5);
	Hotel h2 = new Hotel("ByTwoCoffee", 5.0);
	
	TreeSet<Hotel> t = new TreeSet<Hotel>();
	
	t.add(h1);	
	t.add(h2);	
	
	for(Hotel h : t) {
		System.out.println(h);
	}
	
}
}
