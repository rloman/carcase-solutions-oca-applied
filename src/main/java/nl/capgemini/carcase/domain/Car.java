package nl.capgemini.carcase.domain;

import java.time.LocalDate;

public class Car {

   private static int carCounter = 0;
   private int id;

   private int speed;
   private String licencePlate;
   private double price;
   private int mileAge;

   private LocalDate registrationDate;

   private Tank tank;

   public Car(String licencePlate, double price) {
      this.id = carCounter++;
      this.licencePlate = licencePlate;
      this.price = price;
      this.tank = new Tank();
   }

   public Car(String licensePlate) {
      this(licensePlate, 0);
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

   public void fillAlternate(int liters) {
      while (!this.tank.isEmpty()) {
         drive();
      }
   }

   public void drive() {
      if (!this.tank.isEmpty()) {
         this.mileAge++;
         this.tank.dec();
      }
   }

   public void drive(int km) {
      if (this.tank.getCurrentLevel() > km) {
         this.mileAge += km;
      }
   }

   @Override
   public String toString() {
      return "Car [licencePlate=" + licencePlate + ", price=" + price + "]";
   }

   public int getMileAge() {
      return mileAge;
   }

   public void setMileAge(int mileAge) {
      this.mileAge = mileAge;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((licencePlate == null) ? 0 : licencePlate.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (!(obj instanceof Car)) {
         return false;
      }
      Car other = (Car) obj;
      if (licencePlate == null) {
         if (other.licencePlate != null) {
            return false;
         }
      }
      else if (!licencePlate.equals(other.licencePlate)) {
         return false;
      }
      return true;
   }

   public int getId() {
      return id;
   }

   public LocalDate getRegistrationDate() {
      return registrationDate;
   }

   public void setRegistrationDate(LocalDate registrationDate) {
      this.registrationDate = registrationDate;
   }

}
