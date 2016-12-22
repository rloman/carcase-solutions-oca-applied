package nl.capgemini.carcase.instancevaretc;

public class Application {


   public static void main(String[] args) {
      Speler anja = new Speler(SpelerType.SETUPPER, 2);
      System.out.println(anja.getSpelerCounter());
      Speler anthony = new Speler(SpelerType.LIBERO, 42);

      System.out.println(anthony.getSpelerCounter());
      System.out.println(anja.getSpelerCounter());

      System.out.println(Speler.getSpelerCounter());

   }

}
