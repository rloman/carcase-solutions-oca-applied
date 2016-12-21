package nl.capgemini.carcase.streams;

import java.util.ArrayList;
import java.util.List;

import nl.capgemini.carcase.domain.Car;

public class Application {

   public static void main(String[] args) {

      List<Car> cars = new ArrayList<>();

      Car first = new Car("A");
      first.setMileAge(300);
      Car second = new Car("B");
      second.setMileAge(501);
      Car third = new Car("C");
      third.setMileAge(4);

      cars.add(first);
      cars.add(second);
      cars.add(third);

      cars.stream().filter(car -> car.getMileAge() % 2 == 0).forEach(car -> {

         System.out.printf("Car %d with even mileage: %d %n", car.getId(), car.getMileAge());
      });

      System.out.println("=================");
      cars.stream().filter(car -> car.getMileAge() % 2 != 0).forEach(car -> {

         System.out.printf("Car %d with odd mileage: %d %n", car.getId(), car.getMileAge());
      });

   }

}
