import java.util.Arrays;

public class SquaretheSorted {
   public static void main(String[] args) {
      int[] a={-11,-6,-3,-2,1,3,5,9};
      System.out.println(Arrays.toString(sortit(a)));
   }

   private static int[] sortit(int[] a) {
      int[] ans=new int[a.length];
      int s=0;
      int e=a.length-1;
      int k=a.length-1;
      while(s<=e){
         if((a[s]*(a[s]))>(a[e]*(a[e]))){
            ans[k]=a[s];
            s++;
            k--;
         }
         else {
            ans[k]=a[e];
            e--;
            k--;
         }
      }

      return ans;
   }
}
