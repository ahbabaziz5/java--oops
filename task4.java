import java.util.Scanner;

public class task4 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char str = scanner.next().charAt(0);
 if(str=='a' || str=='e' || str=='i' || str=='o'||  str=='u'|| str=='A' || str=='E' || str=='I' || str=='O' || str=='U' ){
            System.out.println("Character is vowel");
            
        }else{
            System.out.println("Character is consonant");
        }
      
scanner.close();
    }
}
