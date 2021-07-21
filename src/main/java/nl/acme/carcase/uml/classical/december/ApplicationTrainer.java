package nl.acme.carcase.uml.classical.december;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTrainer {

   public static void main(String[] args) {

      Vehicle v = new Truck();

      Truck t = new Truck();

      Car c = new Car();

      List<Vehicle> vehicles = new ArrayList<>();
      vehicles.add(v);
      vehicles.add(t);
      vehicles.add(c);

      t.getFreight();

   }

   public void foo(List<Vehicle> vehicles) {
      for (Vehicle v : vehicles) {
         v.getCurrentLevel();
         // v.getF
         if (v instanceof Truck) {
            Truck trucky = (Truck) v;
            trucky.getFreight(); // rocks

            //

            ((Truck) v).getFreight();
         }
      }

   }
}
