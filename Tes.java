
// import java.util.Arrays;
import java.util.Scanner;

class Tes {
   public static void main(String[] args) {
      String str = "Welcome toWW googleaaaaaaaaaaaaaaaaaa";
      Scanner sc = new Scanner(System.in);
      int[] freq = new int[ 'z'];
      for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         freq[ ch]++;
      }

      while (true) {

         System.out.println("what character u want his number of times it appears");
         char c = sc.next().charAt(0);
         System.out.println(c + " : " + freq[ c] + "  times ....");
         System.out.println("press 1 to continue or press 0 to break");
         int a = sc.nextInt();
         if (a == 0)
            break;
         if (a == 1)
            continue;

      }

   }
}