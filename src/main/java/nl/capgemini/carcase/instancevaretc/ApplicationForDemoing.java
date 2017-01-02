package nl.capgemini.carcase.instancevaretc;

import java.util.LinkedList;
import java.util.List;

public class ApplicationForDemoing {

   public static void main(String[] args) {
      Speler anja = new Speler(SpelerType.SETUPPER, 2);
      Speler anthony = new Speler(SpelerType.LIBERO, 42);
      Speler nassim = new Speler(SpelerType.MIDDENAANVALLER, 81);

      List<Speler> team = new LinkedList<>();
      team.add(anja);
      team.add(anthony);
      team.add(nassim);

      iterate(team);
   }

   /////////////////////////////////////

   public static void iterate(List<Speler> team) {
      for (Speler speler : team) {
         System.out.println("speler met nummmer:"
                           + speler.getShirtNummer()
                           + " is van type " + speler.getSpelerType());
      }

      System.out.println("Before removing:" + team.size());
      Speler victim = new Speler(SpelerType.LIBERO, 42);
      team.remove(victim);

      System.out.println("After removing!!!!!!!!!!");

      for (Speler speler : team) {
         System.out.println("speler met nummmer:"
                           + speler.getShirtNummer()
                           + " is van type " + speler.getSpelerType());
      }
      System.out.println("After removing:" + team.size());

   }

}
