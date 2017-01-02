package nl.capgemini.carcase.uml;

public class Application {

   public static void main(String[] args) {

      Vehicle v = new Truck();
      // v.getFreight(); // fails

      if (v instanceof Truck) { // test
         Truck trucky = (Truck) v; // cast
         System.out.println(trucky.getFreight());
      }

      // below is bad
      Vehicle another = new Car();

      // forgotten the test
      Truck wrongTruck = (Truck) another;

   }

}
