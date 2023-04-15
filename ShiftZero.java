import java.util.Arrays;

public class ShiftZero {
   public static void main(String[] args) {
      int[] arr={11,0,-3,5,0,-11,-118,34,0};
      int []temp=new int[arr.length];
      int a=0;
      for(int n:arr)
      if(n!=0){
      temp[a]=n;
      a++;
      }
      System.out.println(Arrays.toString(temp));
      for(int i=a;i<arr.length;i++){
         temp[i]=1;

      }
      System.out.println(Arrays.toString(moveNeg(arr)));

   }

   static int[] moveNeg(int[] arr){
      int[] temp=new int[arr.length];
      int j=arr.length-1;
      for(int i=arr.length-1;i>=0;i--){
         if(arr[i]>=0){
            temp[j]=arr[i];
            j--;
         }

      }
      for(int i=arr.length-1;i>=0;i--)
      if(arr[i]<0){
         temp[j]=arr[i];
         j--;
      }

      return temp;
   }
}
