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

   public SpelerType getSpelerType() {
      return spelerType;
   }

   public int getShirtNummer() {
      return shirtNummer;
   }

   @Override
   public int hashCode() {
      return shirtNummer;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (!(obj instanceof Speler)) {
         return false;
      }
      Speler other = (Speler) obj;
      if (shirtNummer != other.shirtNummer) {
         return false;
      }
      return true;
   }
}
