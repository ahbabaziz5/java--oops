import java.util.Scanner;

public class task5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
      
        System.out.println("enter values :");
        if(num%4==0){
            System.out.println( " Year is leap" );
        }
       
        else{
            System.out.println("Year isn't leap ");
        }
scanner.close();
    }
}
