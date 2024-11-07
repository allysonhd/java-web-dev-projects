package org.launchcode;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator<Flavor> comparator = new FlavorComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
flavors.sort(comparator);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
cones.sort(new ConeComparator());
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        for (Flavor flavor : flavors) {
            String flavorName = flavor.getName();
            System.out.println(flavorName);
        }
        for (Cone cone : cones) {
            String coneType = cone.getName();
            Double coneCost = cone.getCost();
            System.out.println(coneType + ": " + coneCost);
        }
    }
}