import java.util.Scanner;

public class Input{
   public static void main(String[] args) {
      System.out.println(Multiple());
   }   
   
   public static int Add(int r, int t) {
      return r+t;
   }
   
   public static String Multiple() {
      boolean answer = false;
      Scanner in = new Scanner(System.in);
      while (!answer) {
         System.out.println("What is the answer.");
         System.out.println("enter 1");
         System.out.println("enter 2");
         System.out.println("enter 3");
         System.out.println("enter 4");
         int x = in.nextInt();
         if (x == 3) {
            answer = true;
         }
         else{
            System.out.println("Nope");
         }
      }
      return "Hell Yea";
   }
}