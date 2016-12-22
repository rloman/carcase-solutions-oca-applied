package nl.capgemini.carcase.instancevaretc;

public class Speler extends Persoon {

   private static int spelerCounter = 0;

   private SpelerType spelerType;
   private int shirtNummer;

   public Speler(SpelerType spelerType, int shirtNummer) {
      this.spelerType = spelerType;
      this.shirtNummer = shirtNummer;

      // SpelerType[] spelerTypeArray = SpelerType.values();

      spelerCounter = spelerCounter + 1;
   }

   public static int getSpelerCounter() {
      return spelerCounter;
   }
}
