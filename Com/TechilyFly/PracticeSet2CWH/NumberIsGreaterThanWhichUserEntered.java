package Com.TechilyFly.PracticeSet2CWH;

import java.util.Scanner;

/*
Use comparison operators to find out whether a given number is greater than the user entered number or nut.
*/

public class NumberIsGreaterThanWhichUserEntered {
    public static void main(String[] args) {

        // Creating an Object of Scanner Class to Take User Input from User
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int userNumber = userInput.nextInt();

        int givenNumber = 100;

        userInput.close();

        if(userNumber > givenNumber) {
            System.out.println("User's Number is Greater than Given Number.");
        } else {
            System.out.println("User's Number is Less than Given Number.");
        }
        
    }
    
}
