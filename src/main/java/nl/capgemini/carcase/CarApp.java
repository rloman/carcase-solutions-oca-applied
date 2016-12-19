package nl.capgemini.carcase;

import java.util.ArrayList;
import java.util.List;

public class CarApp {
   public static void main(String[] args) {
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
}
