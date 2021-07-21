package nl.acme.carcase.strings;

public class Application {

   public static void main(String[] args) {

      String firstName = "Manfred";

      System.out.println("Fourth char is:" + firstName.charAt(3));

      // rest of this part of exercise omitted

      // exercise 11
      String c = "Compute";
      String d = "r";

      String result = "Computer";

      String concat = c + d;

      System.out.println(concat);

      System.out.println(concat.equals(result));

      StringBuilder b = new StringBuilder();

      // ASSIGNMENT !!!!!!!!!!!
      // create the String "Computer" using this StringBuilder instance
      b.append("Computer");

      String computer = b.toString();

      System.out.println(computer.equals("Computer"));
      // SHOULD BE true!!!

      System.out.println(computer == result); // bad practise but test for now
   }

}
