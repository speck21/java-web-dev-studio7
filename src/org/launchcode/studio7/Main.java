package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        DVD galaga = new DVD("Galaga", 2024, "DVD");
        CD beths = new CD("Beths", 4048, "CD");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        galaga.spinDisc();
        beths.spinDisc();

    }
}
