package nl.capgemini.carcase.domain;

public class Car {

   private int speed;
   private String licencePlate;
   private double price;

   private Tank tank;

   public Car(String licencePlate, double price) {
      this.licencePlate = licencePlate;
      this.price = price;
      this.tank = new Tank();
   }

   public int getSpeed() {
      return speed;
   }

   public void setSpeed(int speed) {
      this.speed = speed;
   }

   public String getLicencePlate() {
      return licencePlate;
   }

   public void setLicencePlate(String licencePlate) {
      this.licencePlate = licencePlate;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public void fill() {
      this.tank.fill();
   }

   public void fill(int liters) {
      this.tank.fill(liters);
   }

   public void drive() {
      if (!this.tank.isEmpty()) {

      }

   }

   @Override
   public String toString() {
      return "Car [licencePlate=" + licencePlate + ", price=" + price + "]";
   }

}
