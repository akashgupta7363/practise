import java.util.ArrayList;

class Listmissingnum{
   public static void main(String[] args) {
      int[] a={2,4,1,5,7,6,0};
      ArrayList<Integer> al=new ArrayList<>();
      for(int n:a)
      al.add(n);
      for(int i=0; i<a.length;i++){
         if(!al.contains(i))
         System.out.println(i);
      }

   }
}