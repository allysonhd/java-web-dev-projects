package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(int size, String laserType, int spinSpeed) {
        super(size, laserType, spinSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("Spinning this CD at the speed: " + getSpinSpeed() + "rpm");
    }

    @Override
    public void playMedia() {
        System.out.println("Playing CD with laser type: " + getLaserType());
    }

    @Override
    public void storeData() {
        System.out.println("This CD haв a storage capacity of: " + getStorageSize() + "MB");
        setStorageSize(500);
        System.out.println("Now This CD has a storage capacity of: " + getStorageSize() + "MB");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
