package defaultSorting;

public class Hotel implements Comparable<Hotel> {
	String name;
	Double rating;
	
	public Hotel(String name, double rating) {
		this.name=name;
		this.rating=rating;
	}
	@Override
	public String toString() {
		return "Name: "+name+"rating: "+rating;
	}
	@Override
	public int compareTo(Hotel h) {
		return this.rating.compareTo(h.rating);
	}
	/*--FOR compare String Object--
	 * return this.name.compareTo(h.name);
	  
	 */
}
/* ** this --> Object to be inserted h --> already existing object
 * 
 * to compare String object & Double object we are taking the help of
 * compareTo() of String class & compareTo () Double class
 * 
 * 
 * 1.String comparison -> name
 * Ascending Order -> return this.name.compareTo(h.name);
 * Descending Order -> return h.name.compareTo(this.name);
 * 
 * 2.Double comparison we need to made datatype Double as a wrapper class
 * 
 * 
 */
