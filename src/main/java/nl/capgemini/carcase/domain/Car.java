package nl.capgemini.carcase.domain;

public class Car {

   private int speed;
   private String licencePlate;
   private double price;

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

}
