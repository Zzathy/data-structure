package Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        Scanner input = new Scanner(System.in);

        boolean isLoggedIn;
        do {
            System.out.print("Input email: ");
            String email = input.nextLine();
            System.out.print("Input password: ");
            String password = input.nextLine();

            isLoggedIn = studentData.login(email, password);

            if (!isLoggedIn) {
                System.out.println("Login Failed. Try Again.");
            }
        } while (!isLoggedIn);

        StudentData.menu();
    }
}