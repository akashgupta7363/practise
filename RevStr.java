import java.util.Stack;

public class RevStr {
   public static void main(String[] args) {
      String str="welcome all of u to GOOGLE";
      String revStr="";
      Stack<Character> stack=new Stack<>();
      for(int i =0;i<str.length();i++){
         if(str.charAt(i)!=' ')
         stack.push(str.charAt(i));
         if((str.charAt(i)==' ')||(i==str.length()-1)){
            while(stack.isEmpty()==false)
            revStr+=stack.pop()+"";
            revStr+=" ";
         }
         

      }System.out.println(revStr);
   }
}
