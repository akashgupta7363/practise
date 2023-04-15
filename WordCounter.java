public class WordCounter {
   public static void main(String[] args) {
      String str = "Welcome to GOOOGlE Akash";
      int wcount = 0, ucount = 0, vcount = 0, lcount = 0;
      int cCount = 0;

      for (int i = 0; i < str.length(); i++) {

         if (str.charAt(i) == ' ')
            continue;
         ++wcount;
         if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
            lcount++;
         if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
            ucount++;
         if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o')
               || (str.charAt(i) == 'u'))
            vcount++;
         else if ((str.charAt(i) == 'A') || (str.charAt(i) == 'E') || (str.charAt(i) == 'I') || (str.charAt(i) == 'O')
               || (str.charAt(i) == 'U'))
            vcount++;
         else
            cCount++;
      }
      System.out.println(" " + wcount + " " + ucount + " " + vcount + " " + lcount + " " + " " + cCount);

   }
}
