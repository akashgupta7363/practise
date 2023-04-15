public class RevString {
   public static void main(String[] args) {
      String str="okay google";
      //System.out.println(revTheString(str));
   
   }
   String revTheString(String str){
      String rev="";
      for(int i=str.length()-1;i>=0;i--)
      rev+=str.charAt(i)+"";
      return rev;

   }
}
