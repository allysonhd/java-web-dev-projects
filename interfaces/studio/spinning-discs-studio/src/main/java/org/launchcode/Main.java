package org.launchcode;

public class Main {
    public static void main(String[] args) {

        CD cd = new CD(32, "normal", 500);
        DVD dvd = new DVD(120, "diamond", 1600 );

        cd.spinDisc();
        dvd.playMedia();
        cd.storeData();
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}