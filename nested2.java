import java.util.Scanner;

public class nested2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = scanner.nextInt();
        System.out.println("enter num2");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        if(sum > 100){
            double product = num1 * num2;
            if(product %2 == 0){
                System.out.println("product of number is even");
            }else{
                System.out.println(" product of number is odd");
            }
        }
        else if(sum <=100){
            if(num1 > num2){
                System.out.println(num1 + "is greater than" + num2);
            }
            else if(num1 < num2){
                System.out.println(num1 + "is less than" + num2);
            }
            else if(num1 == num2){
                System.out.println(num1 + "is equal than" + num2);
            }

        }
    }

}
