import java.util.Arrays;

public class RotateArray {
   public static void main(String[] args) {
      int[] arr ={1,2,3,4,5,6};
      System.out.println(Arrays.toString((arr)));
      System.out.println(Arrays.toString(leftRotate(arr,2)));
      System.out.println(Arrays.toString(rightRotate(arr,2)));
   }

   private static int[] rightRotate(int[] arr, int p) {
      int []temp=new int[arr.length];
      int j=0;
      for(int i=arr.length-p;i<arr.length;i++){
         temp[j]=arr[i];
         j++;
         }
      for(int i=0;i<arr.length-p;i++){
         temp[j]=arr[i];
         j++;
         }
      



      return temp;
   }

   private static int[] leftRotate(int[] arr, int p) {
      int []temp=new int[arr.length];
      int j=0;
      for(int i=p;i<arr.length;i++){
      temp[j]=arr[i];
      j++;
      }
      for(int i=0;i<p;i++){
         temp[j]=arr[i];
         j++;
         }
      



      return temp;
   }
}
