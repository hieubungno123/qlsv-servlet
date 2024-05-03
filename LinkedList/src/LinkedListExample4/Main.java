package LinkedListExample4;

import java.util.LinkedList;

public class Main {
public static void main(String[] args) {
	//Create list of Books
	LinkedList<Book> list = new LinkedList<Book>();
	
	//Create object Books
	Book b1 = new Book(104, 8, "Let us C","Trần Minh Hiếu" ,"BPB");
	Book b2 = new Book(102, 4, "Data Communication", "Thành Doanh", "Mc Graw Hill");
	Book b3 = new Book(103, 6, "Operating System", "Galvin", "Wiley");
	
	//Adding Books to LinkedList
	list.add(b1);
	list.add(b2);
	list.add(b3);
	
	//Traversing LinkedList 
	for(Book b:list) {
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
}
}
