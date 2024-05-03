package LinkedListExample3;

import java.util.LinkedList;

public class Main {
public static void main(String[] args) {
	LinkedList<String > LL1 = new LinkedList<String>();
    LL1.add("Ravi");  
    LL1.add("Vijay");  
    LL1.add("Ajay");  
    LL1.add("Anuj");  
    LL1.add("Gaurav");  
    LL1.add("Harsh");  
    LL1.add("Virat");  
    LL1.add("Gaurav");  
    LL1.add("Harsh");  
    LL1.add("Hieu");
    LL1.add("Amit");
    System.out.println("Initial list of elements: " +LL1);
    
    //Removing specific element from LinkedList
    LL1.remove("Vijay");
    System.out.println("After invoking remove method: " + LL1);
    
    //Removing element on the basis of specific position
    LL1.remove(0);
    System.out.println("After invoking remove(index) method: " + LL1);
    
    LinkedList<String> LL2 = new LinkedList<String>();
    LL2.add("Ravi");
    LL2.add("Hanumat");
    //Adding new element to LinkedList
    LL1.addAll(LL2);
    System.out.println("Updated list: " + LL1);
    
    //Removing all the new element from LinkedList
    LL1.removeAll(LL2);
    System.out.println("After invoking removeAll() method: " + LL1);
    
    //Removing first element from the list
    LL1.removeFirst();
    System.out.println("Ater invoking movingFirst() method: " + LL1);
    
    //Removing last element from LinkedList
    LL1.removeLast();
    System.out.println("After invoking movingLast() method: " + LL1);
    
    //Removing first occurrence of element from the list
    //Loai bo 1 element dau tien co condition
    LL1.removeFirstOccurrence("Gaurav");
    System.out.println("After invoking removeFirstOccurrence() method: " + LL1);
    
    //Removing last occurrence of the element from the list
    LL1.removeLastOccurrence("Harsh");
    System.out.println("After invoking removeLastOccurrence() method: " + LL1);
  
}
}
