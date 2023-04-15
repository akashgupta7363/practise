class Charcount{
   public static void main(String[] args) {
      String sr="    Welcome    okay akash ok to atlassian   ";
      System.out.println( "a occurs : "+count(sr," "));
   }

   
   private static int count(String sr, String c) {
      String newsr=sr;
     
     System.out.println(newsr);
     newsr =newsr.trim();
     int l=newsr.length();
     System.out.println(newsr);
      newsr=newsr.replace("a", "");
      System.out.println(newsr);
      if(newsr.length()==l)
      return -1;
      return (l-newsr.length());
   }
}