import java.util.HashSet;

public class Intersection {
   public static void main(String[] args) {
      int[] a={1,2,3,4,8};
      int[] b={1,3,4,6,7,8};
      HashSet<Integer> hs=new HashSet<>();
      for(int n:a)
      hs.add(n);
      for(int n:b){
         if(!hs.add(n)){
            System.out.println(n);
         }
      }
   }
   
}
