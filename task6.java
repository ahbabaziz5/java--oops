import java.util.Scanner;

public class task6 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();
        if(nums >= 90 && nums<=100){
            System.out.println("Grade is A");
        }
        else if(nums >= 80 && nums<90){
            System.out.println("Grade is B");
        }
       else  if(nums >= 70 && nums<80){
            System.out.println("Grade is C");
        }
       else if(nums >= 60 && nums<70){
            System.out.println("Grade is D");
        }
        else{
            System.out.println("You are fail !");
        }
        
scanner.close();
    }
}
