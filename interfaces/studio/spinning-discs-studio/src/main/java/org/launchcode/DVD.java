package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(int size, String laserType, int spinSpeed) {
        super(size, laserType, spinSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("This DVD is spinning at the speed of: " + getSpinSpeed() + "RPMs");
    }

    @Override
    public void playMedia() {
        System.out.println("Playing DVD with laser type: " + getLaserType());
    }

    @Override
    public void storeData() {
        System.out.println("This DVD has a capacity of: " + getStorageSize() + "Mb");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
