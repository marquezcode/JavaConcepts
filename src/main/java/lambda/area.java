package lambda;

import java.util.Scanner;

@FunctionalInterface
interface MyInterface {

    double getPiValue();
}
public class area {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            System.out.println("Enter the value of radius");
            int r = kb.nextInt();

            MyInterface ref;

            ref = () -> 3.1415;

            System.out.println("Area of Circle with given radius is = " + r * r * ref.getPiValue());
        }
    }
}
