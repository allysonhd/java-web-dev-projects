package org.launchcode;

public abstract class BaseDisc {

    private int storageSize;
    private String laserType;
    private int spinSpeed;

    public BaseDisc(int size, String laserType, int spinSpeed) {
        this.storageSize = size;
        this.laserType = laserType;
        this.spinSpeed = spinSpeed;
    }

    public void storeData () {
    }

    public void playMedia () {

    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String getLaserType() {
        return laserType;
    }

    public void setLaserType(String laserType) {
        this.laserType = laserType;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }
}
