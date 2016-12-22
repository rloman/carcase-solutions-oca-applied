package nl.capgemini.carcase.arrays;

public class Application {

   public static String padRight(String s, int n) {
      return String.format("%1$-" + n + "s", s);
   }

   public static String padLeft(String s, int n) {
      return String.format("%1$" + n + "s", s);
   }

   public static void main(String[] args) {

      // tables

      int[][] tables = new int[11][11];

      for (int i = 1; i < 11; i++) {
         for (int j = 1; j < 11; j++) {
            tables[i][j] = i * j;
         }
      }

      String headerString = "";
      for (int i = 1; i < 11; i++) {
         headerString += "Table of:" + i + "\t";
      }
      System.out.println(headerString);
      String paddedString = padRight("=", headerString.length() + 11 * 4);
      paddedString = paddedString.replace(' ', '=');
      System.out.println(paddedString);
      for (int i = 1; i < 11; i++) {
         for (int j = 1; j < 11; j++) {

            String result = String.format(" %2dx%1d=%2d ", i, j, tables[i][j]);
            System.out.print(result + "\t");
         }
         System.out.println();
      }
      System.out.println(paddedString);

   }

}
