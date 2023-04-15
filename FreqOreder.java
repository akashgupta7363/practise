import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.*;

class FreqOreder{
   public static void main(String[] args) {
      String str="bananafffffffab";
      HashMap<Character,Integer> hm= new LinkedHashMap<>();
      for(int i=0;i<str.length();i++){
         Integer count=hm.get(str.charAt(i));
         if(count==null)
         hm.put(str.charAt(i), 1);
         else {
            count++;
            hm.put(str.charAt(i), count);
         }
      }
      for(Map.Entry<Character,Integer> m:hm.entrySet()){
         System.out.println(m.getKey()+"  : "+m.getValue());
      }
      Map<Character,Integer> hms =sortByValue(hm);

      for (Map.Entry<Character, Integer> en : hms.entrySet()) {
         System.out.println("Key = " + en.getKey() +
                       ", Value = " + en.getValue());
     }
      


   }

   private static Map<Character, Integer> sortByValue(HashMap<Character, Integer> hm) {
      List<Map.Entry<Character,Integer> >list =new LinkedList<Map.Entry<Character,Integer>>(hm.entrySet());

      Collections.sort(list, new Comparator<Map.Entry<Character,Integer> >() {
         public int compare(Map.Entry<Character,Integer> o1,
         Map.Entry<Character,Integer> o2)
         {
             return (o2.getValue()).compareTo(o1.getValue());
         }
     });

     Map<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
     for (Map.Entry<Character, Integer> aa : list) {
         temp.put(aa.getKey(), aa.getValue());
    
 } 
 return temp;
}

}    