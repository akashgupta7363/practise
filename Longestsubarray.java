import java.util.ArrayList;

public class Longestsubarray {
   public static void main(String[] args) {
      int[] a={01,52,71,1,41,11,2,3,4,55,12,0,31};
      System.out.println(longsubarray(a,a.length));
   }

   private static ArrayList longsubarray(int[] a, int n) {
      ArrayList<Integer> ltn =new ArrayList<>();
      ArrayList<Integer> loa =new ArrayList<>();

      for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
            if((ltn.contains(a[j])||(a[j]==n-1))){
               if(!ltn.contains(a[j]))
               ltn.add(a[j]);
               if(ltn.size()>loa.size()){
                  loa.clear();
                  loa.addAll(ltn);
               }
               ltn.clear();
               break;
            }
            ltn.add(a[j]);
            
            
            }
         }
         return loa;
         
      }

   }

