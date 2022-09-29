package me.java.inheritance.practice01;

import java.util.Objects;

public class SmartPhone {
    private int numOfCameras;
    private int getNumOfCameras;

    public SmartPhone(int numOfCameras, int getNumOfCameras){
        this.numOfCameras = numOfCameras;
        this.getNumOfCameras = getNumOfCameras;
    }

    public int getNumOfCameras() {
        return numOfCameras;
    }

    public void setNumOfCameras(int numOfCameras) {
        this.numOfCameras = numOfCameras;
    }

    public int getGetNumOfCameras() {
        return getNumOfCameras;
    }

    public void setGetNumOfCameras(int getNumOfCameras) {
        this.getNumOfCameras = getNumOfCameras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return numOfCameras == that.numOfCameras && getNumOfCameras == that.getNumOfCameras;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfCameras, getNumOfCameras);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "numOfCameras=" + numOfCameras +
                ", getNumOfCameras=" + getNumOfCameras +
                '}';
    }
}
