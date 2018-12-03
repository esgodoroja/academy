package md.orange.academy.example.collections.queue.examples;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {

  public static void main(String[] args) {
    // Intializing an deque
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>(10);

    // add() method to insert
    arrayDeque.add(10);
    arrayDeque.add(20);
    arrayDeque.add(30);
    arrayDeque.add(40);
    arrayDeque.add(50);
    for (Integer element : arrayDeque) {
      System.out.println("Element : " + element);
    }

    System.out.println("Using clear() ");

    // clear() method
    arrayDeque.clear();

    // addFirst() method to insert at start
    arrayDeque.addFirst(564);
    arrayDeque.addFirst(291);

    // addLast() method to insert at end
    arrayDeque.addLast(24);
    arrayDeque.addLast(14);

    System.out.println("Above elements are removed now");

    // Iterator() :
    System.out.println("Elements of deque using Iterator :");
    for (Iterator itr = arrayDeque.iterator(); itr.hasNext(); ) {
      System.out.println(itr.next());
    }

    // descendingIterator() : to reverse the deque order
    System.out.println("Elements of deque in reverse order :");
    for (Iterator dItr = arrayDeque.descendingIterator();
        dItr.hasNext(); ) {
      System.out.println(dItr.next());
    }

    // element() method : to get Head element
    System.out.println("Head Element using element(): " +
        arrayDeque.element());

    // getFirst() method : to get Head element
    System.out.println("Head Element using getFirst(): " +
        arrayDeque.getFirst());

    // getLast() method : to get last element
    System.out.println("Last Element using getLast(): " +
        arrayDeque.getLast());

    // toArray() method :
    Object[] arr = arrayDeque.toArray();
    System.out.println("Array Size : " + arr.length);

    System.out.print("Array elements : ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(" " + arr[i]);
    }

    // peek() method : to get head
    System.out.println("Head element : " + arrayDeque.peek());

    // poll() method : to get head
    System.out.println("Head element poll : " + arrayDeque.poll());

    // push() method :
    arrayDeque.push(265);
    arrayDeque.push(984);
    arrayDeque.push(2365);

    // remove() method : to get head
    System.out.println("Head element remove : " + arrayDeque.remove());

    System.out.println("The final array is: " + arrayDeque);
  }

}
