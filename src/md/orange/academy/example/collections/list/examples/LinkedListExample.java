package md.orange.academy.example.collections.list.examples;

import java.util.LinkedList;

public class LinkedListExample {


  /* method to create a simple linked list with 3 nodes*/
  public static void main(String[] args) {
    /* Linked List Declaration */
    LinkedList<String> linkedList = new LinkedList<>();

    /*add(String Element) is used for adding
     * the elements to the linked list*/
    linkedList.add("Item1");
    linkedList.add("Item5");
    linkedList.add("Item3");
    linkedList.add("Item6");
    linkedList.add("Item2");

    /*Display Linked List Content*/
    System.out.println("Linked List Content: " + linkedList);

    /*Add First and Last Element*/
    linkedList.addFirst("First Item");
    linkedList.addLast("Last Item");
    System.out.println("LinkedList Content after addition: "
        + linkedList);

    /*This is how to get and set Values*/
    System.out.println("First element: " + linkedList.get(0));
    linkedList.set(0, "Changed first item");
    System.out.println("First element after update by set method: "
        + linkedList.get(0));

    /*Remove first and last element*/
    linkedList.removeFirst();
    linkedList.removeLast();
    System.out.println("LinkedList after deletion of first and last element: "
        + linkedList);

    /*pull, push, peek*/

    linkedList.peek();
    System.out.println("Content after peek(): " + linkedList);
    linkedList.poll();
    System.out.println("Content after pool(): " + linkedList);
    linkedList.push("Pushed String");
    System.out.println("Content after push(): " + linkedList);

    /* Add to a Position and remove from a position*/
    linkedList.add(0, "Newly added item");
    linkedList.remove(2);
    linkedList.remove("Pushed String");
    linkedList.addFirst("New First Element");
    linkedList.addLast("New Last Element");
    System.out.println("Final Content: " + linkedList);


  }

}
