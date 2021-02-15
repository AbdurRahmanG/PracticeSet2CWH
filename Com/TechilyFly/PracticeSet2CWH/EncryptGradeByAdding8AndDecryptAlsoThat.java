package Com.TechilyFly.PracticeSet2CWH;

import java.util.Scanner;

/*
Write a Java Program to encrypt a grade by adding 8 to it. Then Decrypt it to whow the correct grade.
*/

public class EncryptGradeByAdding8AndDecryptAlsoThat {
    public static void main(String[] args) {
        // Creating an Object of Scanner Class to Take User Input from User
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your Grade: Like, A or B or C or D etc.: ");

        char grade = userInput.next().charAt(0);

        grade = (char) (grade + 8);

        userInput.close();

        System.out.println("Your Encrypted Grade is " + grade);
        System.out.println("And Your Decrypted or Real Grade is " + (char) (grade - 8));
    }
    
}
