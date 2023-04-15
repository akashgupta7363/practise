public class NextGreaterElemment {
   public static void main(String[] args) {
      int[] a={2,4,9,1,5,68,11,0,12};
      for(int i=0;i<a.length;i++){
         System.out.println(a[i]+" : "+ nxtGreaterElm(a[i],i,a));
      }
   }

   private static int nxtGreaterElm(int elem, int s, int[] a) {
      for(int j=s;j<a.length;j++){
         if(a[j]>elem){
            return a[j];
         }
      }
      return -1;
   }
}
