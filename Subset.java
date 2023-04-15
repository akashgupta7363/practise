public class Subset {
   public static void main(String[] args) {
      String s="abcd";
      
      for(int i=0;i<s.length();i++){
         String sub="";


         for(int j=i;j<s.length();j++){
            sub+=s.charAt(j);
            System.out.print(sub+" ");
            
            
         // System.out.println(s.substring(i, j));
         }
      }
   }
}
