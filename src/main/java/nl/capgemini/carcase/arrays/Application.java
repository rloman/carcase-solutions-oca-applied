package nl.capgemini.carcase.arrays;

public class Application {

   public static void main(String[] args) {

      // tables

      int[][] tables = new int[11][11];

      for (int i = 1; i < 11; i++) {
         for (int j = 1; j < 11; j++) {
            tables[i][j] = i * j;
         }
      }

      for (int i = 1; i < 11; i++) {
         System.out.print("Table of:" + i + "\t");
      }
      System.out.println();
      System.out.println("============================================================================");
      for (int i = 1; i < 11; i++) {
         for (int j = 1; j < 11; j++) {

            String result = String.format(" %02dx%02d=%03d ", i, j, tables[i][j]);
            System.out.print(result + "\t");
         }
         System.out.println();
      }

   }

}
