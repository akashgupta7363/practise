import java.util.HashMap;
import java.util.HashSet;

class Test1 {
   public static void main(String[] args) {
      int[] a={3,5,7,1,1,1,9,9,5,5,5,3};
      HashMap<Integer,Integer> hm=new HashMap<>();
      
      for(int n:a){
         Integer val=hm.get(n);
         if(val==null){
            hm.put(n,1);
         }else{
            ++val;
            hm.put(n,val);
         }

      }
      for(HashMap.Entry<Integer,Integer> m:hm.entrySet()){
         if(m.getValue()>3)
         System.out.println(m.getKey()+"  ");
      }
   }
}