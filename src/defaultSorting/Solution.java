package defaultSorting;

import java.util.TreeSet;

public class Solution {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("C");
		ts.add("B");
		ts.add("A");
		for(String s :ts) {
			System.out.println(s);
		}

		System.out.println("__________\n");
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(20);
		t.add(30);
		t.add(20);
		t.add(10);
		for(Integer i :t) {
			System.out.println(i);
		}
	}
}
/* -----RULES-----
 * 1.When you add an object into TreeSet , internally compareTo() gets called.
 * 2.return type of compareTo is int, +1>
 * 									  -1<
 * 									  0==
 * 3.Underlined DS of TreeSet -> Binary Tree
 * 4.Traversing Order of TreeSet is leftnode parentnode rightnode
 * 5. compareTo() is present in all the wrapper classes and String class.
 * 6.if you add Integer Object, compareTo() of Integer class gets called
 * likewise if you add String object -> comareTo()->String class...
 */
