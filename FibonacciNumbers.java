import java.util.Scanner;

public class FibonacciNumbers {
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
     
      int range=sc.nextInt();
      sc.close();

   printFibbo(range);
   System.out.println(nthFibbo(range));
   }

  private static int nthFibbo(int range) {
   if(range==1||range==0)
   return 0;
   if(range==2)
   return 1;
      return nthFibbo(range-1)+nthFibbo(range-2);
   }

static void printFibbo( int range) {
      int n1=0,n2=1,n3=0;
      System.out.print(n1+"  "+n2);
      for(int i=1;i<=range-2;i++){
         n3=n1+n2;
         System.out.print(" "+n3);
         n1=n2;
         n2=n3;
      }
System.out.println();
      System.out.println(n3);
      
   }
}

