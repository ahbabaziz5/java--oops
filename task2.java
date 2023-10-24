import java.util.Scanner;
public class task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("enter values :");
        if(num1>num2){
            System.out.println(num1 + " is greater than" + num2 );
        }
       
        else{
            System.out.println(num2  + " is greater than " + num1);
        }
scanner.close();
    }
}

