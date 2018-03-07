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

/*

    FROM THE ANSWER KEY:
    Compare to your code please.

    package com.company.Question_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

   
    YOUR NAME HERE! - No really put your name here so we know who this belongs to when we grade it <3


    private List<String> myArrayList = new ArrayList<>();

    public static void main(String[] args) {

        1. In this class initialize a List as an ArrayList.
        2. Create a method called addToArrayList to add 6 values of your choosing to this ArrayList.
        3. Create a new method in this class called displayArray.
        4. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.


        Main main = new Main();
        main.addToArrayList();

    }

    private void addToArrayList() {

        myArrayList.add("something");
        myArrayList.add("something 2");
        myArrayList.add("something 3");
        myArrayList.add("something 4");
        myArrayList.add("something 5");
        myArrayList.add("something 6");

        displayArray();
    }

    private void displayArray() {

        for (String item : myArrayList) {
            System.out.println(item);

        }

    }
}

*/