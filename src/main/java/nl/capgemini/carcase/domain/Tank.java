package nl.capgemini.carcase.domain;

public class Tank {

   private int maxLevel = 80;
   private int minLevel = 0;

   private int currentLevel;

   public void fill() {
      if (currentLevel < maxLevel) {
         this.currentLevel++;
      }
   }

   public void fill(int liters) {
      if (currentLevel + liters <= maxLevel) {
         this.currentLevel += liters;
      }
   }

   public boolean isEmpty() {
      return this.currentLevel == 0;
   }
}
