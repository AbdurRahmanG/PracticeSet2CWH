package Com.TechilyFly.PracticeSet2CWH;

import java.util.Scanner;

/*
Write the Following expression in a Java Program :
(V^2 - U^2)/2as
*/

public class FollowingExpression2{
    public static void main(String[] args) {

        // Creating an Object of Scanner Class to Take User Input from User
        Scanner userInput = new Scanner(System.in);

        int v = userInput.nextInt();
        int u = userInput.nextInt();
        int a = userInput.nextInt();
        int s = userInput.nextInt();
        userInput.close();

        int result = (v*v - u*v) / (2 * a * s);
        System.out.println(result);
        
    }
    
}
