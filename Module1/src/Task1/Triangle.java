package Task1;

import java.util.Scanner;

public class Triangle<N> {
    private N base;
    private N height;

    public Triangle(N base, N height) {
        this.base = base;
        this.height = height;
    }

    public int getResultAsInt() {
        return (int) base * (int) height / 2;
    }

    public double getResultAsDouble() {
        return (double) base * (double) height / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "===CALCULATE THE AREA OF TRIANGLE===\nWant to display broad results in a form? :\n1. Result to Integer\n2. Result to Double\nInput choices : ");

        int choices = input.nextInt();

        System.out.println("Input base value and height of triangle");

        if (choices == 1) {
            System.out.print("Input Base\t : ");
            int base = input.nextInt();
            System.out.print("Input Height\t : ");
            int height = input.nextInt();
            Triangle<Integer> broadIntType = new Triangle<Integer>(base, height);
            System.out.println("Broad of Triangle in Integer : " + broadIntType.getResultAsInt());
        } else if (choices == 2) {
            System.out.print("Input Base\t : ");
            double base = input.nextDouble();
            System.out.print("Input Height\t : ");
            double height = input.nextDouble();
            Triangle<Double> broadIntType = new Triangle<Double>(base, height);
            System.out.println("Broad of Triangle in Integer : " + broadIntType.getResultAsDouble());
        } else {
            System.out.println("Wrong choice");
        }
    }
}
