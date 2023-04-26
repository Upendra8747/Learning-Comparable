package defaultSorting;

public class Car implements Comparable<Car> {
	int cost;

	public Car(int cost) {
		this.cost = cost;
	}

	public String toString() {
		return "cost: " + cost;
	}

	public int compareTo(Car c) {
		return this.cost - c.cost;
	}
}
/* ---RULES---
 * 1.implements the Comparable interface present in java.lang package.
 * 2.Specifies Generics
 * 3.Override compareTo() -> public int compareTo(Element e);
 */



