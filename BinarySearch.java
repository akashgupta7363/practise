class BinarySearch{
   public static void main(String[] args) {
      int[] a={1,2,4,7,23,54,67};
      int index=binaryRecursive(a,0,a.length-1,23);
      int indexx=binarySearch(a,23);
      System.out.println(index +" , "+indexx);
   }

   private static int binaryRecursive(int[] a, int s, int e,int k) {
      if(s>e)
      return -1;
      int mid=s+(e-s)/2;
      if(a[mid]==k)
      return mid;
      else if(a[mid]>k)
      return binaryRecursive(a, s, mid-1, k);
      else return binaryRecursive(a, mid+1, e, k);

      
   }

   private static int binarySearch(int[] a,int k) {
      int s=0;
      int e=a.length-1;
      
      while(s<=e){
         int mid=s+(e-s)/2;
         if(a[mid]==k)
         return mid;
         else if(a[mid]>k){
            e=mid-1;
         }
         else {
               s=mid+1;
            }

         
      }
      return -1;
   }
}