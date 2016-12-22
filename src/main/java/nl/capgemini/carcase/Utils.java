package nl.capgemini.carcase;

public class Utils {

   public Utils() {

   }

   public static int max(int first, int... rest) {
      int max = first;
      for (int getal : rest) {
         if (getal > max) {
            max = getal;
         }
      }

      return max;
   }

}
