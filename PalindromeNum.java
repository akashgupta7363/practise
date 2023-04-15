import java.util.Scanner;
public class PalindromeNum {
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      sc.close();
      System.out.println(revNumber(n));
      System.out.println(revNumber(n)==n);
   }
   static int revNumber(int n){
      int revNum=0;
      int rem;
      while(n!=0){
         rem=n%10;
         revNum=(revNum*10)+rem;
         n/=10;

      }



      return revNum;
   }
}
