import java.util.*;

public class queuestack4ch20 {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>(); //created list type that takes integer and is type arraylist
    arrayList.add(1); // 1 is autoboxed to an Integer object at index 0
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(1);
    arrayList.add(4);
    
    arrayList.add(0, 10); //the existing elements in the index will not be removed, instead will be shifted up to make room.
    arrayList.add(3, 30);

    System.out.println("A list of integers in the array list:");
    System.out.println(arrayList);

    LinkedList<Object> linkedList = new LinkedList<>(arrayList); //using arrayList to be put into linkedlist array which takes Objects.
    linkedList.add(1, "red"); //adding red string object at location 1
    linkedList.removeLast();
    linkedList.addFirst("green"); //will not repalce any elements, just gonna make space


    System.out.println();
    System.out.println("----Before displaying----");
    System.out.println();


    System.out.println("Display the linked list forward:"); 
    ListIterator<Object> listIterator = linkedList.listIterator(); //created listiterator object since we need a special one for iterating through linked lists
    while (listIterator.hasNext()) { //returns true if there is more stuff to read.
      System.out.print(listIterator.next() + " ");
    }
    System.out.println();
  
    System.out.println("Display the linked list backward:");
    listIterator = linkedList.listIterator(linkedList.size()); //list interator is set to the size of the list
    while (listIterator.hasPrevious()) { //go back
      System.out.print(listIterator.previous() + " ");
    }
  }
} 