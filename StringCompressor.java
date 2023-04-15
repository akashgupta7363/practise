import java.util.HashMap;
import java.util.Map;



public class StringCompressor {
   public static void main(String[] args) {
      String s="aaaabbcccdddddffghh";
      String comStr="";
      Map<Character,Integer> hm=new HashMap<>();
      for(int i=0;i<s.length();i++){
         Integer count=hm.get(s.charAt(i));
         if(count==null){
            hm.put(s.charAt(i), 1);
         }
         else{
            ++count;
            hm.put(s.charAt(i), count);
         }
            
         }
         for(Map.Entry<Character,Integer> ss:hm.entrySet()){
            comStr+=ss.getKey()+""+ss.getValue();
         }
          System.out.println(hm.get('a'));
          System.out.println(comStr);
          System.out.println(compressIt(s));

      }

      static String compressIt(String s){
         String compS="";
         int count=1;
         for( int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                compS+=s.charAt(i)+""+count;
               count=1;

               
            }
            else{
              
               count++;
            }

             if(i==s.length()-2){
               compS+=s.charAt(i+1)+""+count;
             }

         }
         


         return compS;

      }
     
   }

