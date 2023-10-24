import java.util.Scanner;

public class nested1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter something");

        String name = scanner.nextLine();
        
        // System.out.println("your input " + name);
        if (name.equals("yes") || name.equals("y") || name.equals("Yes") || name.equals("Y")) {
            // System.out.println("enter two number");
            System.out.println("Enter num1");

        Float num1 = scanner.nextFloat();
        System.out.println("enter num2");

        Float num2 = scanner.nextFloat();
            if (num1 > num2) {
                System.out.println(num1 + " is greater");
            } else {
                System.out.println(num2 + " is greater ");
            }
        }

        else if (name.equals("no") || name.equals("n") || name.equals("No") || name.equals("N")) {
            System.out.println("Enter num1");

        Float num1 = scanner.nextFloat();
        System.out.println("enter num2");

        Float num2 = scanner.nextFloat();

            if (num1 < num2) {
                System.out.println(num1 + " is samller");
            } else {
                System.out.println(num2 + " is samller");
            }

        } else {
            System.out.println("Thankuh !");
        }
        scanner.close();
    }

}
