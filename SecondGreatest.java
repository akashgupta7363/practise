public class SecondGreatest {
   public static void main(String[] args) {
      int[] arr={9,11,3,111,1,33,-21};
      System.out.println(secondGreatElem(arr));
      System.out.println(secondSmallestElem(arr));
   }

   private static int secondSmallestElem(int[] arr) {
      int sec_min=Integer.MAX_VALUE;
      int min=Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
         if(min>arr[i]){
            sec_min=min;
            min=arr[i];
         }
         else if(arr[i]<sec_min && arr[i]>min)
         sec_min=arr[i];
      }
      return sec_min;
   }

   private static int secondGreatElem(int[] arr) {
      int sec_max=Integer.MIN_VALUE;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
         if(arr[i]>max){
         sec_max=max;
         max=arr[i];
      }
         if(arr[i]>sec_max && arr[i]<max)
         sec_max=arr[i];


      }
      return sec_max;
   }
}
