package nl.capgemini.carcase.uml;

public class Tank {

   private int maxLevel;
   private int currentLevel;


   public Tank(int maxLevel, int currentLevel) {
      this.maxLevel = maxLevel;
      this.currentLevel = currentLevel;
   }

   public int getMaxLevel() {
      return maxLevel;
   }

   public int getCurrentLevel() {
      return currentLevel;
   }

}
