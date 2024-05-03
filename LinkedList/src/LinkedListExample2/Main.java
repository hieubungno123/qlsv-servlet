package LinkedListExample2;

import java.util.LinkedList;

public class Main {
public static void main(String[] args) {
	LinkedList<String> LL = new LinkedList<String>();
	System.out.println("Initial list of element: " + LL);
	LL.add("Ravi");
	LL.add("Vijay");
	LL.add("Ajay");
	System.out.println("After invoking add method: " + LL);
	System.out.println();

	//Add an element at the specific position
	LL.add(1,"Guarav");
	System.out.println("After invoking add(index,element) method: " + LL);
	System.out.println();

	LinkedList<String> LL2= new LinkedList<String>();
	LL2.add("Sonoo");
	LL2.add("Hanumat");
	//Adding second list element to the first list
	LL.addAll(LL2);
	System.out.println("After invoking addAll method: " + LL);
	System.out.println();

	LinkedList<String> LL3 = new LinkedList<String>();
	LL3.add("John");
	LL3.add("Rahul");
	//Adding second list elements to the first at specific position
	LL.addAll(1,LL3);
	System.out.println("After invoking addAll(index,element) method: " + LL);
	System.out.println();

	//Adding an element at the first position
	LL.addFirst("Lokesh");
	System.out.println("After invoking addFist(() method: " + LL);
	System.out.println();
	
	//Adding an element at the last position
	LL.addLast("Harsh");
	System.out.println("After invoking addLast() method: " + LL);
	System.out.println();

}
}
