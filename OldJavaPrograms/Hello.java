import java.util.Scanner;

public class Hello{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter in two numbers:");
      int x = in.nextInt();
      int y = in.nextInt();
      System.out.println(x+y);
   }   
}