import java.util.Scanner;

public class task3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
      
        System.out.println("enter values :");
        if(num%2==0){
            System.out.println(num+ " is even" );
        }
       
        else{
            System.out.println(num  + " is odd");
        }
scanner.close();
    }
}
