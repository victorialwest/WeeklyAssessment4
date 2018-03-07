package com.company.Question_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Car> carsList = new ArrayList<>();


    public static void main(String[] args) {
        /*
        The Arraylist in this class is populated with Car objects.
        1. Create a method in this class that will list all of the models of the cars in the list.
         */

        Main main = new Main();
        main.populateArrayList();
        main.models();
    }

    private void populateArrayList() {

        carsList.add(new Car("Toyota", "Prius", "Red"));
        carsList.add(new Car("Toyota", "Tacoma", "Silver"));
        carsList.add(new Car("Honda", "Civic", "Black"));
        carsList.add(new Car("Honda", "Insight", "Blue"));
        carsList.add(new Car("Tesla", "Model 3", "Grey"));
    }

    private void models() {
        System.out.println(model);
    }
//forgot how to label the item to print, but i know once you label it you print it.
}

/*
    FROM THE ANSWER KEY:
    This is the entire code from the answer key for this class:

    import java.util.ArrayList;
    import java.util.List;

    public class Main {

        private List<Car> carsList = new ArrayList<>();


        public static void main(String[] args) {

            The Arraylist in this class is populated with Car objects.
            1. Create a method in this class that will list all of the models of the cars in the list.


        Main main = new Main();
            main.populateArrayList();

                    main.viewModels();
        }

        private void populateArrayList() {

            carsList.add(new Car("Toyota", "Prius", "Red"));
            carsList.add(new Car("Toyota", "Tacoma", "Silver"));
            carsList.add(new Car("Honda", "Civic", "Black"));
            carsList.add(new Car("Honda", "Insight", "Blue"));
            carsList.add(new Car("Tesla", "Model 3", "Grey"));
        }


        private void viewModels() {

            for (Car car : carsList) {
                System.out.println(car.getModel());
            }
        }

    }


*/
