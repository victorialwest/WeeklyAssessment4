package com.company.Question_1;

import java.util.List;

public class Main {

   /*
    Victoria West
     */

    public static void main(String[] args) {
         /*
        1. In this class initialize a List as an ArrayList.
        2. Create a method called addToArrayList to add 6 values of your choosing to this ArrayList.
        3. Create a new method in this class called displayArray.
        4. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */


         List<String> arrayList = new arrayList();


         public void displayArray() {

            arrayList.add("Item 1");
            arrayList.add("Item 2");
            arrayList.add("Item 3");
            arrayList.add("Item 4");
            arrayList.add("Item 5");
            arrayList.add("Item 6");


            for (String item : arrayList) {
                System.out.println(item);
            }
        }

    }
}
