import java.util.Scanner;

public class Main {
    // you may keep whole user object here
    public static String CUR_USER = null;
    public static void userMenu(Scanner sc) {
        int choice;
        do {
            System.out.print("\n0. Exit\n1. Addition\n2. Subtraction\nEnter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: // Addition
                    addition(sc);
                    break;
                case 2: // Subtraction
                    subtraction(sc);
                    break;
            }
        }while(choice != 0);
    }

    private static void addition(Scanner sc) {
        int num1, num2, result;
        System.out.print("Enter number1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        num2 = sc.nextInt();
        result = num1 + num2;
        System.out.println("Addition Result: " + result);
    }

    private static void subtraction(Scanner sc) {
        int num1, num2, result;
        System.out.print("Enter number1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        num2 = sc.nextInt();
        result = num1 - num2;
        System.out.println("Subtraction Result: " + result);
    }

    public static void mainMenu(Scanner sc) {
        int choice;
        do {
            System.out.print("\n0. Exit\n1. Sign In\n2. Sign Up\nEnter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: // Sign In
                    CUR_USER = authenticate(sc);
                    if(CUR_USER != null)
                        userMenu(sc);
                    else
                        System.out.println("Invalid Login.");
                    break;
                case 2: // Sign Up
                    registerUser(sc);
                    break;
            }
        }while(choice != 0);
    }

    private static void registerUser(Scanner sc) {
        // write your registration logic here
    }

    private static String authenticate(Scanner sc) {
        String email, password;
        System.out.print("Enter email: ");
        email = sc.next();
        System.out.print("Enter password: ");
        password = sc.next();
        // write your authentication logic here i.e. search from db or file
        // here i'm keeping it too simple
        if(email.equals(password))
            return email;
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainMenu(sc);
        sc.close();
    }
}
