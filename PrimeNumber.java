public class PrimeNumber {
   public static void main(String[] args) {
      int n=29;
      boolean b=isPrime(n);
      System.out.println(b?"its prime":"its not");
   }

   private static boolean isPrime(int n) {
      if(n<=1)
      return false;
      else{
         for(int i=2;i<=n/2;i++)
         if(n%i==0)
         return false;
      }


      return true;
   }
}
