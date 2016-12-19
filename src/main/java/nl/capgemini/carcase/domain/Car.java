package nl.capgemini.carcase.domain;

public class Car {

   private int speed;
   private String licencePlate;
   private double price;

   public Car(String licencePlate, double price) {
      this.licencePlate = licencePlate;
      this.price = price;
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

   @Override
   public String toString() {
      return "Car [licencePlate=" + licencePlate + ", price=" + price + "]";
   }

}
