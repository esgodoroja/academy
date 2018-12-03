package md.orange.academy.example.collections.list.examples;

import java.util.ArrayList;

public class ArrayListExample {

  public static void main(String[] args) {
    // size of ArrayList
    int n = 50;

    //declaring ArrayList with initial size n
    ArrayList<Integer> arrayList = new ArrayList<>();

    // Appending the new element at the end of the list
    for (int i=1; i<=n; i++)
      arrayList.add(i);

    // Printing elements
    System.out.println(arrayList);

    // Remove element at index 3
    arrayList.remove(3);

    // Displaying ArrayList after deletion
    System.out.println(arrayList);

    // Printing elements one by one
    for (int i=0; i<arrayList.size(); i++)
      System.out.print(arrayList.get(i)+" ");

    System.out.println("foreach example");
    arrayList
        .forEach(e -> System.out.println("element = " + e));


    //indexOf
    //clear
  }
}

