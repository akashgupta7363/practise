import java.util.*;

class PalindromeString{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();


      sc.close();
      RevString r=new RevString();
      System.out.println(r.revTheString(str));
      System.out.println(r.revTheString(str).equals(str));
      // System.out.println(RevString.revTheString(str));
      // System.out.println(RevString.revTheString(str).equals(str));
   }
}