package LinkedListExample1;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
public static void main(String[] args) {
	LinkedList<String> LL = new LinkedList<String>();
	LL.add("Ravi");
	LL.add("Vijay");
	LL.add("Ravi");
	LL.add("Ajay");
	
	Iterator<String> itr = LL.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println();
	
	//Đổi ngược từ dưới lên
	//Traversing the LL of the element in reverse order
	Iterator i = LL.descendingIterator();
	System.out.println("After reverse order the LinkedList");
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
