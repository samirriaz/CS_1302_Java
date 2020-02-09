package EighteenOne;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by samirriaz on 4/13/17.
 */
public class EighteenOne {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a large number:");
        BigInteger x = scan.nextBigInteger();
        System.out.print("The factorial is " + factorial(x));

    }
    public static BigInteger factorial(BigInteger x) {
        if (x.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return x.multiply(factorial(x.subtract(BigInteger.ONE)));

    }
}
