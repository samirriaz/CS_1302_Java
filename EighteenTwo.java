package EighteenTwo;

import java.util.Scanner;

/**
 * Created by samirriaz on 4/13/17.
 */
public class EighteenTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String value = scan.nextLine();
        reverseDisplay(value);
    }
    public static void reverseDisplay(String value) {
        if (value.length()==1)
            System.out.println(value);
        else
        { System.out.print(value.charAt(value.length()-1));
        reverseDisplay(value.substring(0, value.length()-1));}
    }
}

