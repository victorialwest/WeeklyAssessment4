package com.company.Question_5;

public class Main {

    public static void main(String[] args) {
         /*
         1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
         2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
         3. Make sure you prompt your user as to what they should enter
         4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
         */

         /*
         FROM THE ANSWER KEY:
         below is the code necessary for the above tasks.

         Main main = new Main();
         main.runSwitch();

         */

    }

        /*
        FROM THE ANSWER KEY:
        below is the necessary code for the above tasks.

        private void runSwitch() {

        System.out.println("Enter your favorite pet: ");

        switch (input.nextLine().toUpperCase()) {

            case "CAT":
                System.out.println("I like Cats too, lets be friends");
                break;
            case "DOG":
                System.out.println("Meh, Dogs are ok.");
                break;
            case "FISH":
                System.out.println("Really, a fish??  They're barely considered pets");
                break;
            case "HORSE":
                System.out.println("Horses are kinds neat.");
                break;
            default:
                System.out.println("That must not be a real animal, try again.");
                runSwitch();
                break;
        }

       */

}





