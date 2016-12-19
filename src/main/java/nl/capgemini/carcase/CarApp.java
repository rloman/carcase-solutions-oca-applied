package nl.capgemini.carcase;

import java.util.ArrayList;
import java.util.List;

import nl.capgemini.carcase.domain.Car;

public class CarApp {
   public static void main(String[] args) {

      Car zero = new Car("A", 0);
      zero.setMileAge(000);
      Car one = new Car("B", 1);
      one.setMileAge(100);
      Car two = new Car("C", 2);
      two.setMileAge(200);

      int[][] usage = new int[][] { { zero.getId(), zero.getMileAge() }, { one.getId(), one.getMileAge() },
            { two.getId(), two.getMileAge() } };

      for (int[] car : usage) {
         System.out.println("Car with id " + car[0] + " has driven " + car[1] + " kms");
         // alternate / better / cleaner
         // System.out.printf("Car with id %d has driven %d kms %n", car[0],
         // car[1]);
      }

   }

   public static void mainExercise1To3() {
      System.out.println("Welcome to my very first car application! Yahoo!");

      // exercise 2
      int speed = 80;

      System.out.println(speed);

      // exercise 3
      int age = 45;
      int yearOfRegistration = 1998;

      int[] numbers = new int[] { speed, age, yearOfRegistration };

      System.out.println(numbers);

      // print in loop
      for (int number : numbers) {
         System.out.println(number);
      }

      // alternate to assign the array
      int[] alternateNumbers = { speed, age, yearOfRegistration };
      System.out.println(alternateNumbers);

      // exercise 3 extra
      List<Integer> numberList = new ArrayList<>();

      numberList.add(speed);
      numberList.add(age);
      numberList.add(yearOfRegistration);

      for (int num : numberList) {
         System.out.println(num);
      }

      // alternate / stream
      numberList.stream().forEach(num -> {
         System.out.println(num);
      });
   }

   public static void mainEquality() {
      String first = "first";
      String second = "second";

      if (first.equals(second)) {
         System.out.println("Failing for String");
      }
      first = "second";

      if (first.equals(second)) {
         System.out.println("Succeeding for String");
      }

      Car car = new Car("AA-BB-CC", 25000);
      Car anotherCar = new Car("CC", 23000);

      if (car.equals(anotherCar)) {
         System.out.println("Equals fails");
      }
      else {
         System.out.println("Equals is OK");
      }

      Car clone = new Car("AA-BB-CC", 25000);

      if (clone.equals(car)) {
         System.out.println("Equals OK");
      }
      else {
         System.out.println("Equals fails");
      }
   }
}
