package nl.acme.carcase.uml.classical.december;

public abstract class Vehicle {

   private Tank tank;

   public Vehicle(int maxLevel, int currentLevel) {
      this.tank = new Tank(maxLevel, currentLevel);
   }

   public int getCurrentLevel() {
      return tank.getCurrentLevel();
   }
}
