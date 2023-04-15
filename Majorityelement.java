import java.util.HashMap;

public class Majorityelement {
   public static void main(String[] args) {
      int[] arr={2,4,2,2,3,3,2};
      System.out.println(majorElem(arr));
      System.out.println(max(arr));
      System.out.println(majorElemFreq(arr));

   }

   private static int majorElemFreq(int[] arr) {
      int[] freq =new int[100];
      int l=arr.length/2;
      for(int n:arr){
         freq[n]++;
      }
      for(int i=0;i<freq.length;i++){
         if(freq[i]>l)
         return i;
      }
      
      return -1;
   }

   private static int max(int[] arr) {
      int maxVal=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
         if(maxVal<arr[i])
         maxVal=arr[i];

      }
      
      return maxVal;
   }

   private static int majorElem(int[] arr) {
      int l=arr.length/2;
      HashMap<Integer,Integer> hs=new HashMap<>();
      for(int n:arr){
         Integer count=hs.get(n);
         if(count!=null){
            count++;
            hs.put(n, count);
         }else {
            hs.put(n, 1);
         }

      }

      for(HashMap.Entry<Integer,Integer> ent:hs.entrySet()){
         if(ent.getValue()>l)
         return ent.getKey();
      }
      return -1;
   }

}