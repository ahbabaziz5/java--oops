import java.util.Scanner;
public class task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num>0){
            System.out.println(num + " is positive" );
        }
        else if(num==0){
            System.out.println(num + "is zero");
        }
        else{
            System.out.println(num  + " is negative");
        }
scanner.close();
    }
}